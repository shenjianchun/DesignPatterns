package com.github.pattern.factory;

/**
 * 抽象工厂
 * Created by JC on 2016-06-29.
 */
public abstract class AudiFactory {

    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
