package com.github.pattern.bridge;

/**
 * Created by JC on 2016-07-12.
 */
public abstract class CoffeeAdditives {
    /**
     * 具体要往咖啡里添加什么也是由子类实现
     *
     * @return 具体添加的东西
     */
    public abstract String addSomething();
}
