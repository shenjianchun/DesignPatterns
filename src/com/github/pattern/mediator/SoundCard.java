package com.github.pattern.mediator;

/**
 * 声卡同事
 * Created by JC on 2016-07-07.
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放音频
     * @param data 音频数据
     */
    public void soundPlay(String data) {
        System.out.println("音频：" + data);
    }
}
