package com.github.pattern.proxy;

/**
 * Created by JC on 2016-07-08.
 */
public class Client {

    public static void main(String[] args) {
        // 构造一个小民
        ILawsuit xiaoMin = new XiaoMin();
        // 构造一个代理律师并将小民作为构造参数传递进去
        ILawsuit lawyer = new Lawyer(xiaoMin);

        // 律师提交诉讼申请
        lawyer.submit();
        // 律师进行举证
        lawyer.burden();
        // 律师代替小民进行辩护
        lawyer.defend();
        // 完成诉讼
        lawyer.finish();


    }

}
