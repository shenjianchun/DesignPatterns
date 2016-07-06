package com.github.pattern.template;

/**
 * Created by JC on 2016-07-06.
 */
public class Test {

    public static void main(String[] args) {
        AbstractComputer computer = new CoderComputer();
        computer.startUP();

        computer = new MilitaryComputer();
        computer.startUP();
    }
}
