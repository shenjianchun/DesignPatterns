package com.github.pattern.propotype;

/**
 * 登录实现
 * Created by JC on 2016-06-28.
 */
public class LoginImpl implements Login {
    @Override
    public void login() {
        User loginUser = new User();
        loginUser.age = 21;
        loginUser.name = "JC";
        loginUser.address = new User.Address("Shanghai", "xuanwu", "110号");

        LoginSession.getInstance().setLoginUser(loginUser);
    }


}
