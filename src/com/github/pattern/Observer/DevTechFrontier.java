package com.github.pattern.observer;

import java.util.Observable;

/**
 * DevTechFrontier 即开发技术前线，这个网站是被观察者角色,
 * 当它有更新时所有的观察者都会接收到相应的通知
 * Created by JC on 2016-07-03.
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content) {
        // 标识状态或者内容发生改变
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }

}
