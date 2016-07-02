package com.github.pattern.state;

/**
 * 电视控制器，类似于经典状态模式中的Context
 * Created by JC on 2016-07-02.
 */
public class TvController implements PowerController {

    private TvState mState;

    public void setState(TvState state) {
        mState = state;
    }

    @Override
    public void powerOn() {
        setState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nexChannel() {
        mState.nextChannel();
    }

    public void prevChannel() {
        mState.prevChannel();
    }

    public void turnUp() {
        mState.turnUp();
    }

    public void turnDown() {
        mState.turnDown();
    }
}
