package com.github.pattern.bridge;

/**
 * Created by JC on 2016-07-12.
 */
public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives imp) {
        super(imp);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + imp.addSomething() + "咖啡");
    }
}
