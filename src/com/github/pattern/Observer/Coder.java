package com.github.pattern.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 程序员是观察者
 * Created by JC on 2016-07-03.
 */
public class Coder implements Observer {

    private String mName;

    public Coder(String name) {
        mName = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Hi," + mName + ", DevTechFrontier更新啦, 内容:" + arg);
    }

    @Override
    public String toString() {
        return "码农：" + mName;
    }
}
