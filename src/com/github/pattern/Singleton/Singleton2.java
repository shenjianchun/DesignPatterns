package com.github.pattern.singleton;

/**
 * 使用静态内部类单例模式
 * Created by JC on 2016-06-26.
 */
public class Singleton2 {

    private Singleton2(){}

    public static Singleton2 getInstance() {
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton2 sInstance = new Singleton2();
    }
}
