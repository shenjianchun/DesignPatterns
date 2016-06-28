package com.github.pattern.propotype;

/**
 * 测试程序
 * Created by JC on 2016-06-28.
 */
public class Test {

    public static void main(String[] args) {

        Login login = new LoginImpl();
        login.login();

        User sessionUser = LoginSession.getInstance().getLoginUser();
        System.out.println(sessionUser.toString());

    }

}
