package com.github.pattern.mediator;

/**
 * 客户类
 * Created by JC on 2016-07-07.
 */
public class Client {

    public static void main(String[] args) {
        // 构造主板对象
        MainBoard mainBoard = new MainBoard();

        // 分别构造各个零部件
        CDDevice cdDevice = new CDDevice(mainBoard);
        GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
        SoundCard soundCard = new SoundCard(mainBoard);
        CPU cpu = new CPU(mainBoard);

        // 将各个零部件安装到主板
        mainBoard.setCDDevice(cdDevice);
        mainBoard.setGraphicsCard(graphicsCard);
        mainBoard.setSoundCard(soundCard);
        mainBoard.setCPU(cpu);

        // 完成后可以开始放片了
        cdDevice.load();
    }
}
