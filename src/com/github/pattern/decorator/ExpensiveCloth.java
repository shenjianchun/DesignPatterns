package com.github.pattern.decorator;

/**
 * 具体装饰类
 * Created by JC on 2016-07-11.
 */
public class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(Person person) {
        super(person);
    }

    /**
     * 穿短袖
     */
    public void dressShirt() {
        System.out.println("穿件短袖");
    }

    /**
     * 穿皮衣
     */
    public void dressLeather() {
        System.out.println("穿件皮衣");
    }

    /**
     * 穿牛仔裤
     */
    public void dressJean() {
        System.out.println("穿条牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();

        dressShirt();
        dressJean();
        dressLeather();

    }
}
