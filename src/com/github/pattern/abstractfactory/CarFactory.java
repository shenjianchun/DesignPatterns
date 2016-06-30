package com.github.pattern.abstractfactory;

/**
 * 抽象工厂角色
 * Created by JC on 2016-06-30.
 */
public abstract class CarFactory {
    /**
     * 创建轮胎
     * @return
     */
    public  abstract Tire.ITire createTire();

    public abstract Engine.IEngine createEngine();

    public abstract Brake.IBrake createBrake();
}
