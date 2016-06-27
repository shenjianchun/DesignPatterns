package com.github.pattern.builder;

/**
 * 抽象Product类
 * Created by JC on 2016-06-27.
 */
public abstract class Computer {

    // 主机
    protected String mBoard;
    // 系统
    protected String mOS;
    // 显示器
    protected String mDisplay;

    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public abstract void setOS();

    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    @Override
    public String toString() {
        return "Computer [mBoard = " + mBoard + ", mOS = " + mOS + ", mDisplay = " + mDisplay + " ]";
    }
}
