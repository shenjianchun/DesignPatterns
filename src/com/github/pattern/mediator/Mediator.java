package com.github.pattern.mediator;

/**
 * 抽象中介者
 * Created by JC on 2016-07-07.
 */
public abstract class Mediator {

    /**
     * 同事对象改变时通知中介者的方法
     * 在同事对象改变时由中介者去通知其他的同事对象
     * @param c 同事对象
     */
    public abstract void changed(Colleague c);
}
