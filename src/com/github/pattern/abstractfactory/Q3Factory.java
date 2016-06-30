package com.github.pattern.abstractfactory;

/**
 * 具体工厂实现角色
 * Created by JC on 2016-06-30.
 */
public class Q3Factory extends CarFactory {

    @Override
    public Tire.ITire createTire() {
        return new Tire.NormalTire();
    }

    @Override
    public Engine.IEngine createEngine() {
        return new Engine.DomesticEngine();
    }

    @Override
    public Brake.IBrake createBrake() {
        return new Brake.NormalBrake();
    }
}
