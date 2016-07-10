package com.github.pattern.composite;

/**
 * 客户类
 * Created by JC on 2016-07-10.
 */
public class Client {

    public static void main(String[] args) {
        // 构建一个目录对象表示C盘根目录
        Dir diskC = new Folder("C");
        // C盘根目录下有一个文件ImbamallLog.txt
        diskC.addDir(new File("ImbamallLog.txt"));

        // C盘根目录下还有3个子目录Windows、PrefLogs、Program File
        Dir dirWin = new Folder("Windows");
        dirWin.addDir(new File("explorer.exe"));
        diskC.addDir(dirWin);

        // PrefLogs 目录
        Dir dirPref = new Folder("PrefLogs");
        dirPref.addDir(new File("null.txt"));
        diskC.addDir(dirPref);

        // Program File 目录
        Dir dirPro = new Folder("Program File");
        diskC.addDir(dirPro);

        // Program File 目录下有文件ftp.txt
        dirPro.addDir(new File("ftp.txt"));

        diskC.print();
    }

}
