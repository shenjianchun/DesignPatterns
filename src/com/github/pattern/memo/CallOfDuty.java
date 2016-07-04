package com.github.pattern.memo;

import java.lang.reflect.Method;

/**
 * 使命召唤游戏
 * Created by JC on 2016-07-04.
 */
public class CallOfDuty {

    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    // 玩游戏
    public void play() {
        System.out.println("玩游戏：" + String.format("第%d关", mCheckPoint ) + "奋战杀敌中");
        mLifeValue -= 10;
        System.out.println("难度升级啦");

        mCheckPoint++;
        System.out.println("到达" + String.format("第%d关", mCheckPoint ));
    }

    public void quit() {
        System.out.println("----------------");
        System.out.println("退出前的游戏属性：" + this.toString());
        System.out.println("退出游戏！");
        System.out.println("----------------");
    }

    /**
     * 创建备忘录
     * @return
     */
    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.mCheckPoint = mCheckPoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    public void restore(Memoto memoto) {
        this.mCheckPoint = memoto.mCheckPoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
        System.out.println("恢复后的游戏属性：" + this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty[mCheckPoint=" + mCheckPoint + ", mLifeValue=" +mLifeValue+
                ",mWeapon=" + mWeapon +"]";
    }
}
