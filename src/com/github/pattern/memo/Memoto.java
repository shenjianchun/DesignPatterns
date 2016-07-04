package com.github.pattern.memo;

/**
 * 备忘录类
 * Created by JC on 2016-07-04.
 */
public class Memoto {
    public int mCheckPoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memoto[mCheckPoint=" + mCheckPoint + ", mLifeValue=" + mLifeValue +
                ", mWeapon=" + mWeapon + "]";
    }
}
