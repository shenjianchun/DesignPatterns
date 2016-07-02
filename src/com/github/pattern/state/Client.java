package com.github.pattern.state;

/**
 * 客户类
 * Created by JC on 2016-07-02.
 */
public class Client {

    public static void main(String[] args) {

        TvController mTvController = new TvController();
        mTvController.powerOn();
        mTvController.nexChannel();
        mTvController.turnUp();

        mTvController.powerOff();
        mTvController.prevChannel();
    }



}
