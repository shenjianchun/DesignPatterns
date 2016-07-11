package com.github.pattern.decorator;

/**
 * 抽象装饰类
 * Created by JC on 2016-07-11.
 */
public abstract class PersonCloth extends Person {
    private Person mPerson; // 保持一个Person类的引用

    public PersonCloth(Person person) {
        mPerson = person;
    }

    @Override
    public void dressed() {
        // 调用Person类中的dressed方法
        mPerson.dressed();
    }
}
