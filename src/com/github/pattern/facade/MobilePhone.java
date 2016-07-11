package com.github.pattern.facade;

/**
 * Created by JC on 2016-07-11.
 */
public class MobilePhone {

    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new SamsungCamera();


    public void dail() {
        mPhone.dail();
    }

    public void videoChat() {
        System.out.println("--> 视频聊天接通中");
        mCamera.open();
        mPhone.dail();
    }

    public void hangup() {
        mPhone.hangup();
    }

    public void takePicture() {
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera() {
        mCamera.close();
    }
}
