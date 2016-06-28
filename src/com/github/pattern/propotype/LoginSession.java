package com.github.pattern.propotype;

/**
 * Created by JC on 2016-06-28.
 */
public class LoginSession {
    private static LoginSession sLoginSession = null;

    private User loginUser;

    private LoginSession(){}

    void setLoginUser(User user) {
        this.loginUser = user;
    }

    public User getLoginUser() {
        return loginUser;
    }

    public static LoginSession getInstance() {
        if (sLoginSession == null) {
            sLoginSession = new LoginSession();
        }
        return sLoginSession;
    }



}
