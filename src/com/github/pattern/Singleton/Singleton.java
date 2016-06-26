package com.github.pattern.singleton;

/**
 * 使用Double Check Lock 实现单例模式
 * Created by JC on 2016-06-26.
 */
public class Singleton {

    private static Singleton sInstance = null;

    private Singleton() {

    }

    public static Singleton getsInstance() {

        if (sInstance == null) {
            synchronized (Singleton.class) {
                if (sInstance == null) {
                    sInstance = new Singleton();
                }
            }
        }

        return sInstance;
    }

}
