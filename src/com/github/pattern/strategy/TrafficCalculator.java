package com.github.pattern.strategy;

/**
 * 公交出行价格计算器
 * Created by JC on 2016-07-01.
 */
public class TrafficCalculator {

    public static void main(String[] args) {

        TrafficCalculator calculator = new TrafficCalculator();
        calculator.setStrategy(new BusStrategy());
        System.out.println("公交车16公里的价格：" + calculator.calculatePrice(16));

    }

    CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy strategy) {
        mStrategy = strategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }

}
