package com.github.pattern.factory;

/**
 * 简单工厂 或者 静态工厂 模式
 * Created by JC on 2016-06-29.
 */
public class StaticFactory {

    public static AudiCar createAudiCar() {
        return new AudiCar.AudiQ3();
    }
}
