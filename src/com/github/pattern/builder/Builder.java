package com.github.pattern.builder;

/**
 * 抽象Builder类
 * Created by JC on 2016-06-27.
 */
public abstract class Builder {

    // 设置主机
    public abstract void buildBoard(String board);

    // 设置显示器
    public abstract void buildDisplay(String display);

    // 设置系统
    public abstract void buildOS();

    // 创建Computer
    public abstract Computer create();

}
