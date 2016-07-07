package com.github.pattern.mediator;

/**
 * 光驱同事
 * Created by JC on 2016-07-07.
 */
public class CDDevice extends Colleague {

   private String data; // 视频数据

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    /**
     * 获取视频数据
     * @return 视频数据
     */
    public String read() {
        return data;
    }

    /**
     * 加载视频数据
     */
    public void load() {
        // 实际情况中视频数据与音频数据再同一个数据流中
        data = "视频数据,音频数据";

        // 通知中介者 也就是主板改变
        mMediator.changed(this);
    }

}
