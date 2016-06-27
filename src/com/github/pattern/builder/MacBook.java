package com.github.pattern.builder;

/**
 * 具体的Computer类，MacBook
 * Created by JC on 2016-06-27.
 */
public class MacBook extends Computer {

    @Override
    public void setOS() {
        mOS = "Mac OS X";
    }
}
