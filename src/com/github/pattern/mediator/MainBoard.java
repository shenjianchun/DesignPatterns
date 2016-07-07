package com.github.pattern.mediator;

/**
 * 主板中介者
 * Created by JC on 2016-07-07.
 */
public class MainBoard extends Mediator {

    private CDDevice mCDDevice; // 光驱设备
    private GraphicsCard mGraphicsCard; // 显卡设备
    private SoundCard mSoundCard; // 声卡设备
    private CPU mCPU; // CPU


    public void setCDDevice(CDDevice CDDevice) {
        mCDDevice = CDDevice;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        mGraphicsCard = graphicsCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        mSoundCard = soundCard;
    }

    public void setCPU(CPU CPU) {
        mCPU = CPU;
    }

    @Override
    public void changed(Colleague c) {

        if (c instanceof CDDevice) {
            handleCD((CDDevice) c);
        } else if (c instanceof CPU) {
            handleCPU((CPU) c);
        }

    }

    /**
     * 处理光驱读取数据后与其他设备的交互
     * @param cdDevice 光驱设备
     */
    private void handleCD(CDDevice cdDevice){
        mCPU.decodeData(cdDevice.read());
    }

    /**
     * 处理CPU读取数据后与其他设备的交互
     * @param cpu CPU
     */
    private void handleCPU(CPU cpu) {

        mGraphicsCard.videoPlay(cpu.getDataVideo());

        mSoundCard.soundPlay(cpu.getDataSound());
    }

}
