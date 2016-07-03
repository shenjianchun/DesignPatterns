package com.github.pattern.command;

/**
 * 客户类
 * Created by JC on 2016-07-03.
 */
public class Player {

    public static void main(String[] args) {
        // 首先要有俄罗斯方块游戏
        TetrisMachine machine = new TetrisMachine();

        // 按钮可以执行不同的命令
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(new LeftCommand(machine));
        buttons.setRightCommand(new RightCommand(machine));
        buttons.setFallCommand(new FallCommand(machine));
        buttons.setTransformCommand(new TransformCommand(machine));

        // 具体按下哪个按钮
        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();

    }

}
