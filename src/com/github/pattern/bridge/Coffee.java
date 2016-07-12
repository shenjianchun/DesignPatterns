package com.github.pattern.bridge;

/**
 *
 * Created by JC on 2016-07-12.
 */
public abstract class Coffee {

    protected CoffeeAdditives imp;

    public Coffee(CoffeeAdditives imp) {
        this.imp = imp;
    }

    /**
     * 咖啡具体是什么样的由子类决定
     */
    public abstract void makeCoffee();
}
