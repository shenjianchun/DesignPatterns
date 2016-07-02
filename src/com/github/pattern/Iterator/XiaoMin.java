package com.github.pattern.Iterator;

/**
 * 客户类
 * Created by JC on 2016-07-02.
 */
public class XiaoMin {

    public static void main(String[] args) {
        // 构造各个领导对象
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        // 设置上一级领导处理对象
        groupLeader.nextLeader = director;
        director.nextLeader = manager;
        manager.nextLeader = boss;

        // 发起报账申请
        groupLeader.handleRequest(50000);

    }


}
