package com.github.pattern.decorator;

/**
 * 具体装饰类
 * Created by JC on 2016-07-11.
 */
public class CheapCloth extends PersonCloth {
    public CheapCloth(Person person) {
        super(person);
    }

    /**
     * 穿短裤
     */
    public void dressShorts() {
        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
