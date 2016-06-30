package com.github.pattern.abstractfactory;

/**
 * 发动机相关类
 * Created by JC on 2016-06-30.
 */
public class Engine {

    /**
     * 发动机抽象产品
     */
    interface IEngine {
        void engine();
    }

    public static class DomesticEngine implements IEngine{

        @Override
        public void engine() {
            System.out.println("国产发动机");
        }
    }

    public static class ImportEngine implements IEngine {
        @Override
        public void engine() {
            System.out.println("进口发动机");
        }
    }

}
