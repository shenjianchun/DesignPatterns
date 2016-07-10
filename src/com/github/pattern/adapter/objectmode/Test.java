package com.github.pattern.adapter.objectmode;

/**
 * Created by JC on 2016-07-10.
 */
public class Test {

    public static void main(String[] args) {

        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压：" + adapter.getVolt5());

    }
}
