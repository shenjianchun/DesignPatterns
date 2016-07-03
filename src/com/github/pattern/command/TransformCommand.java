package com.github.pattern.command;


/**
 * 具体命令者 改变形状的命令
 * Created by JC on 2016-07-03.
 */
public class TransformCommand implements Command {

    // 持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine mMachine;

    public TransformCommand(TetrisMachine machine) {
        mMachine = machine;
    }

    @Override
    public void execute() {
        mMachine.transform();
    }
}
