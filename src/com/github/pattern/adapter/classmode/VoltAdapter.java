package com.github.pattern.adapter.classmode;

/**
 * Adapter角色，将220V的电压转化为5V的电压
 * Created by JC on 2016-07-10.
 */
public class VoltAdapter extends Volt220 implements FiveVolt {

    @Override
    public int getVolt5() {
        return 5;
    }
}
