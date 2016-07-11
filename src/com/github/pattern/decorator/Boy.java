package com.github.pattern.decorator;

/**
 * 具体Component，被装饰类
 * Created by JC on 2016-07-11.
 */
public class Boy extends Person {
    @Override
    public void dressed() {
        // Boy类下dressed方法的基本逻辑
        System.out.println("穿了内衣内裤");
    }
}
