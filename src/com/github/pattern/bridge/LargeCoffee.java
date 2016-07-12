package com.github.pattern.bridge;

/**
 * Created by JC on 2016-07-12.
 */
public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives imp) {
        super(imp);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + imp.addSomething() + "咖啡");
    }
}
