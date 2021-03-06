package com.hcwins.vehicle.ta.evs.apiobj.enterprise;

/**
 * Created by wenji on 10/04/15.
 */
public class VerifyMobileAndCaptcha {
    public static VerifyMobileAndCaptchaRequest getVerifyMobileAndCaptchaRequest(String mobile, String captcha) {
        VerifyMobileAndCaptchaRequest VerifyMobileAndCaptchaRequest = new VerifyMobileAndCaptchaRequest();
        VerifyMobileAndCaptchaRequest.setMobile(mobile);
        VerifyMobileAndCaptchaRequest.setCaptcha(captcha);
        return VerifyMobileAndCaptchaRequest;
    }

    public static VerifyMobileAndCaptchaResponse postVerifyMobileAndCaptchaRequest(String mobile, String captcha) {
        VerifyMobileAndCaptchaRequest VerifyMobileAndCaptchaRequest = getVerifyMobileAndCaptchaRequest(mobile, captcha);
        VerifyMobileAndCaptchaRequest.post();
        return VerifyMobileAndCaptchaRequest.getLastResponseAsObj();
    }
}
