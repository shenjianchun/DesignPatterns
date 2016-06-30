package com.github.pattern.abstractfactory;

/**
 * 制动系统相关类
 * Created by JC on 2016-06-30.
 */
public class Brake {

    /**
     * 制动系统 抽象产品
     */
    interface IBrake {
        void brake();
    }

    public static class NormalBrake implements IBrake {
        @Override
        public void brake() {
            System.out.println("普通制动");
        }
    }

    public static class SeniorBrake implements IBrake {
        @Override
        public void brake() {
            System.out.println("高级制动");
        }
    }


}
