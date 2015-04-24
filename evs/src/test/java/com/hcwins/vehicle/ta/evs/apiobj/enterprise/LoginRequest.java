package com.hcwins.vehicle.ta.evs.apiobj.enterprise;

import com.hcwins.vehicle.ta.evs.EVSUtil;
import com.hcwins.vehicle.ta.evs.apiobj.BaseAccountRequest;

/**
 * Created by tommy on 4/22/15.
 */
public class LoginRequest extends BaseAccountRequest {
    protected final static String api = EVSUtil.getAPISet().getEnterprise().getLogin();

    @Override
    public String getAPI() {
        return api;
    }

    @Override
    public LoginResponse getLastResponseAsObj() {
        return getLastResponseAsObj(LoginResponse.class);
    }
}
