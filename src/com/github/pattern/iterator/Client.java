package com.github.pattern.iterator;

/**
 * Created by JC on 2016-07-05.
 */
public class Client {

    public static void main(String[] args) {

        CompanyMin min = new CompanyMin();
        check(min.iterator());

        System.out.println("-----------------------------------");

        CompanyHui hui = new CompanyHui();
        check(hui.iterator());
    }


    public static void check(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
