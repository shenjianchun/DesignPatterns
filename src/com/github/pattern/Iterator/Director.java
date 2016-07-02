package com.github.pattern.Iterator;

/**
 * Created by JC on 2016-07-02.
 */
public class Director extends Leader {

    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("主管批复报销" + money + "元");
    }
}
