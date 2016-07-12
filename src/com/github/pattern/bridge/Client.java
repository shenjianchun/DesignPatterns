package com.github.pattern.bridge;

/**
 * Created by JC on 2016-07-12.
 */
public class Client {

    public static void main(String[] args) {
        // 原汁原味
        Originary implOriginary = new Originary();
        // 加糖
        Sugar implSugar = new Sugar();

        // 大杯咖啡 原味
        LargeCoffee largeCoffee = new LargeCoffee(implOriginary);
        largeCoffee.makeCoffee();

        // 小杯咖啡 原味
        SmallCoffee smallCoffee = new SmallCoffee(implOriginary);
        smallCoffee.makeCoffee();

        // 大杯咖啡 加糖
        LargeCoffee largeCoffee1 = new LargeCoffee(implSugar);
        largeCoffee1.makeCoffee();

        // 小杯咖啡 加糖
        SmallCoffee smallCoffee1 = new SmallCoffee(implSugar);
        smallCoffee1.makeCoffee();

    }
}
