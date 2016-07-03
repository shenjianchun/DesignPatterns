package com.github.pattern.command;

/**
 * 请求者类
 * Created by JC on 2016-07-03.
 */
public class Buttons {

    private LeftCommand mLeftCommand;
    private RightCommand mRightCommand;
    private FallCommand mFallCommand;
    private TransformCommand mTransformCommand;

    public void setLeftCommand(LeftCommand leftCommand) {
        mLeftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        mRightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        mFallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        mTransformCommand = transformCommand;
    }


    /**
     * 按下按钮向左移动
     */
    public void toLeft() {
        mLeftCommand.execute();
    }

    /**
     * 按下按钮向右移动
     */
    public void toRight() {
        mRightCommand.execute();
    }

    /**
     * 按下按钮快速落下
     */
    public void fall() {
        mFallCommand.execute();
    }

    /**
     * 按下按钮改变形状
     */
    public void transform() {
        mTransformCommand.execute();
    }

}
