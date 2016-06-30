package com.github.pattern.abstractfactory;

/**
 * Client
 * Created by JC on 2016-06-30.
 */
public class Client {

    public static void main(String[] args) {
        // 构造一个生产Q3的工厂
        CarFactory factoryQ3 = new Q3Factory();
        factoryQ3.createTire().tire();
        factoryQ3.createEngine().engine();
        factoryQ3.createBrake().brake();

        System.out.println("--------------------------");


        // 构造一个生产Q7的工厂
        CarFactory factoryQ7 = new Q7Factory();
        factoryQ7.createTire().tire();
        factoryQ7.createEngine().engine();
        factoryQ7.createBrake().brake();
    }
}
