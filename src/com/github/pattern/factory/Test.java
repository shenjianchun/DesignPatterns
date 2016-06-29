package com.github.pattern.factory;

/**
 * Created by JC on 2016-06-29.
 */
public class Test {

    public static void main(String args[]) {
        AudiFactory factory = new AudiCarFactory();
        AudiCar car1 = factory.createAudiCar(AudiCar.AudiQ3.class);
        car1.drive();
        car1.selfNavigation();

        AudiCar car2 = factory.createAudiCar(AudiCar.AudiQ5.class);
        car2.drive();
        car2.selfNavigation();
    }
}
