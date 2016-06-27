package com.github.pattern.builder;

/**
 * Director类，负责构造Computer类
 * Created by JC on 2016-06-27.
 */
public class Director {

    Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }


    // 测试类
    public static void main(String[] args) {

        Builder builder = new MacBookBuilder();
        Director director = new Director(builder);
        director.construct("英特尔主板","Retina显示器");

        System.out.println("Computer info: " + builder.create());

    }
}
