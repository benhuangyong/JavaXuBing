package com.hcwins.vehicle.ta.evs.apiobj.enterprise;

import com.hcwins.vehicle.ta.evs.apiobj.BaseAccountResponse;

/**
 * Created by tommy on 4/22/15.
 */
public class LoginResponse extends BaseAccountResponse {
    private int enterpriseStatus;

    public int getEnterpriseStatus() {
        return enterpriseStatus;
    }

    public void setEnterpriseStatus(int enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
    }
}
