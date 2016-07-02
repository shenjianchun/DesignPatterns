package com.github.pattern.state;

/**
 * 关机状态，此时只有开机功能是有效的
 * Created by JC on 2016-07-02.
 */
public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {

    }

    @Override
    public void prevChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
