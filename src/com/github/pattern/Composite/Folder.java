package com.github.pattern.composite;

import java.util.Iterator;
import java.util.List;

/**
 * 表示文件夹的类
 * Created by JC on 2016-07-10.
 */
public class Folder extends Dir {

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void print() {
        System.out.print(getName() + "( ");

        Iterator<Dir> iterator = dirs.iterator();
        while (iterator.hasNext()) {

            Dir dir = iterator.next();
            dir.print();

            if (iterator.hasNext()) {
                System.out.print(" , ");
            }

        }

        System.out.print(" )");
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }
}
