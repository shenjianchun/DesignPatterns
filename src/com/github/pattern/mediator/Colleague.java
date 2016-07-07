package com.github.pattern.mediator;

/**
 * 抽象同事类
 * Created by JC on 2016-07-07.
 */
public abstract class Colleague {
    protected Mediator mMediator;

    public Colleague(Mediator mediator) {
        mMediator = mediator;
    }
}
