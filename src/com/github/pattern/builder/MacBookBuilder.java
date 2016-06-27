package com.github.pattern.builder;

/**
 * 苹果电脑Builder
 * Created by JC on 2016-06-27.
 */
public class MacBookBuilder extends Builder {

    private Computer mComputer = new MacBook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {

        return mComputer;
    }
}
