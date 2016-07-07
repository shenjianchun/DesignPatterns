package com.github.pattern.mediator;

/**
 * 显卡同事
 * Created by JC on 2016-07-07.
 */
public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 播放视频
     * @param data 视频数据
     */
    public void videoPlay(String data) {
        System.out.println("视频：" + data);
    }

}
