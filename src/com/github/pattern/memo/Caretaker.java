package com.github.pattern.memo;

/**
 * Caretaker，负责管理Memoto
 * Created by JC on 2016-07-04.
 */
public class Caretaker {

    Memoto mMemoto; // 备忘录

    public void archive(Memoto memoto){
        mMemoto = memoto;
    }

    public Memoto getMemoto() {
        return mMemoto;
    }
}
