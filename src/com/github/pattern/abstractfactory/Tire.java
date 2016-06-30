package com.github.pattern.abstractfactory;

/**
 * 轮胎相关类
 * Created by JC on 2016-06-30.
 */
public class Tire {

    /**
     * 轮胎抽象产品角色
     */
    interface ITire {
        /**
         * 轮胎
         */
        void tire();
    }

    public static class NormalTire implements ITire{

        @Override
        public void tire() {
            System.out.println("普通轮胎");
        }
    }

    public static class SUVTire implements ITire{

        @Override
        public void tire() {
            System.out.println("普通轮胎");
        }
    }

}
