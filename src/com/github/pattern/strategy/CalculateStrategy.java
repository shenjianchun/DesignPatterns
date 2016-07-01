package com.github.pattern.strategy;

/**
 * 计算接口 -- 抽象策略类
 * Created by JC on 2016-07-01.
 */
public interface CalculateStrategy {

    /**
     * 按距离计算价格
     * @param km 公里
     * @return 返回价格
     */
    int calculatePrice(int km);
}
