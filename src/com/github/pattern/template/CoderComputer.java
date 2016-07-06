package com.github.pattern.template;

/**
 * 程序员的计算机
 * Created by JC on 2016-07-06.
 */
public class CoderComputer extends AbstractComputer {

    @Override
    protected void login() {
        System.out.println("程序员只需要进行用户和密码验证就可以了");
    }
}
