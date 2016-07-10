package com.github.pattern.adapter.objectmode;

/**
 * Adapter角色，将220V的电压转化为5V的电压
 * Created by JC on 2016-07-10.
 */
public class VoltAdapter implements FiveVolt {

    private Volt220 mVolt220;

    public VoltAdapter(Volt220 volt220) {
        mVolt220 = volt220;
    }

    public int  getVolt220() {
        return mVolt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
