package com.github.pattern.factory;

/**
 * 抽象产品类
 * Created by JC on 2016-06-29.
 */
public abstract class AudiCar {

    public abstract void drive();

    public abstract void selfNavigation();

    /**
     * 具体产品类
     * Created by JC on 2016-06-29.
     */
    public static class AudiQ3 extends AudiCar {
        @Override
        public void drive() {
            System.out.println("Q3 启动！");
        }

        @Override
        public void selfNavigation() {
            System.out.println("Q3 启动自动导航");
        }
    }

    /**
     * 具体产品类
     * Created by JC on 2016-06-29.
     */
    public static class AudiQ5 extends AudiCar {
        @Override
        public void drive() {
            System.out.println("Q5 启动！");
        }

        @Override
        public void selfNavigation() {
            System.out.println("Q5 启动自动导航");
        }
    }

    /**
     * 具体产品类
     * Created by JC on 2016-06-29.
     */
    public static class AudiQ7 extends AudiCar {
        @Override
        public void drive() {
            System.out.println("Q7 启动！");
        }

        @Override
        public void selfNavigation() {
            System.out.println("Q7 启动自动导航");
        }
    }

}
