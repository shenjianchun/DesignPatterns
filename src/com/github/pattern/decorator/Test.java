package com.github.pattern.decorator;

/**
 * Created by JC on 2016-07-11.
 */
public class Test {

    public static void main(String[] args) {
        // 首先我们要一个person男孩
        Person boy = new Boy();

        // 然后为他穿上便宜的衣服
        PersonCloth clothCheap = new CheapCloth(boy);
        clothCheap.dressed();

        System.out.println("-----------------------------------------");

        // 或者给他穿上比较上档次的衣服
        PersonCloth clothExpensive = new ExpensiveCloth(boy);
        clothExpensive.dressed();

    }
}
