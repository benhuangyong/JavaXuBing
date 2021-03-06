package com.hcwins.vehicle.ta.evs.apidao;

import com.hcwins.vehicle.ta.evs.EVSUtil;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by wenji on 13/04/15.
 */
@Annotations.Entity(table = "EVS_EnterpriseAdminCredential", mapper = EVSEnterpriseAdminCredential.Mapper.class)
public class EVSEnterpriseAdminCredential extends BaseEntity {
     /*Table: EVS_EnterpriseAdminCredential
Columns:
id bigint not null auto_increment,
createTime datetime,
updateTime datetime,
credentialName varchar(255) not null,
password varchar(255) not null,
enterpriseAdminId bigint not null,
      */

    protected String credentialName;
    protected String password;
    protected Long enterpriseAdminId;

    public EVSEnterpriseAdminCredential(Long id, Date createTime, Date updateTime, String credentialName, String password, Long enterpriseAdminId) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.credentialName = credentialName;
        this.password = password;
        this.enterpriseAdminId = enterpriseAdminId;
    }

    public String getCredentialName() {
        return credentialName;
    }

    public void setCredentialName(String credentialName) {
        this.credentialName = credentialName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getEnterpriseAdminId() {
        return enterpriseAdminId;
    }

    public void setEnterpriseAdminId(Long enterpriseAdminId) {
        this.enterpriseAdminId = enterpriseAdminId;
    }

    public static class Mapper implements ResultSetMapper<EVSEnterpriseAdminCredential> {
        public EVSEnterpriseAdminCredential map(int index, ResultSet r, StatementContext ctx) throws SQLException {
            return new EVSEnterpriseAdminCredential(
                    r.getLong("id"),
                    r.getTimestamp("createTime"),
                    r.getTimestamp("updateTime"),
                    r.getString("credentialName"),
                    r.getString("password"),
                    r.getLong("enterpriseAdminId")
            );
        }
    }

    @Override
    public String toString() {
        return "EVSEnterpriseAdminCredential{" +
                "credentialName='" + credentialName + '\'' +
                ", password='" + password + '\'' +
                ", enterpriseAdminId=" + enterpriseAdminId +
                "} " + super.toString();
    }

    public static EVSEnterpriseAdminCredentialDao dao = EVSUtil.getDAO(EVSEnterpriseAdminCredentialDao.class);
}

