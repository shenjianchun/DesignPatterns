package com.github.pattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示文件和文件夹的抽象类
 * Created by JC on 2016-07-10.
 */
public abstract class Dir {

    /**
     * 声明一个List成员变量存储文件夹的所有元素
     */
    protected List<Dir> dirs = new ArrayList<>();

    /**
     * 当前文件或者文件夹的名字
     */
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 添加一个文件或文件夹
     * @param dir 文件或文件夹
     */
    public abstract void addDir(Dir dir);

    /**
     * 移除一个文件或文件夹
     * @param dir 文件或文件夹
     */
    public abstract void rmDir(Dir dir);

    /**
     * 清空文件夹下所有元素
     */
    public abstract void clear();

    /**
     * 输出文件夹目录结构
     */
    public abstract void print();

    /**
     * 获取文件夹下所有的文件和文件夹
     * @return 文件夹下所有的文件和文件夹
     */
    public abstract List<Dir> getFiles();

    /**
     * 获取文件或者文件夹名字
     * @return 文件或文件夹名字
     */
    public String getName() {
        return name;
    }
}
