package com.github.pattern.facade;

/**
 * Created by JC on 2016-07-11.
 */
public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
