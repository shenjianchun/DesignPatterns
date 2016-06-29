package com.github.pattern.factory;

/**
 * 具体工厂类
 * Created by JC on 2016-06-29.
 */
public class AudiCarFactory extends AudiFactory {

    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clz) {

        T car = null;

        try {
            car = (T) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return car;
    }
}
