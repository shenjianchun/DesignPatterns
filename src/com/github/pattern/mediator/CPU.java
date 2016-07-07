package com.github.pattern.mediator;

/**
 * CPU同事
 * Created by JC on 2016-07-07.
 */
public class CPU extends Colleague {

    private String dataVideo, dataSound; // 视频和音频数据

    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    public void decodeData(String data) {
        // 分割音、视频数据
        String[] tmp = data.split(",");
        // 解析音、视频数据
        dataVideo = tmp[0];
        dataSound = tmp[1];

        mMediator.changed(this);
    }


}
