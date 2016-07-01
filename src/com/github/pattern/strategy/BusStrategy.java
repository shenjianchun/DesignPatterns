package com.github.pattern.strategy;

/**
 * 公交车价格计算策略 -- 具体策略实现
 * Created by JC on 2016-07-01.
 */
public class BusStrategy implements CalculateStrategy {

    /**
     * 北京公交车，十公里之内一元钱，超过十公里之后每加一元钱可以乘5公里
     * @param km 公里
     * @return
     */
    @Override
    public int calculatePrice(int km) {

        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        // 价格计算
        int price = 1 + extraFactor * 1;

        return fraction != 0 ? ++price : price;
    }
}
