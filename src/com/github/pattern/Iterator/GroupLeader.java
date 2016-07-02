package com.github.pattern.Iterator;

/**
 * 组长
 * Created by JC on 2016-07-02.
 */
public class GroupLeader extends Leader {

    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长批复报销" + money + "元");
    }
}
