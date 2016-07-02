package com.github.pattern.state;

/**
 * 电视状态接口，定义了电视操作的函数
 * Created by JC on 2016-07-02.
 */
public interface TvState {
    void nextChannel();
    void prevChannel();
    void turnUp();
    void turnDown();
}
