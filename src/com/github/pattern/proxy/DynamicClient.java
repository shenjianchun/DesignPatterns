package com.github.pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理  客户类
 * Created by JC on 2016-07-08.
 */
public class DynamicClient {

    public static void main(String[] args) {
        // 构造一个小民
        ILawsuit xiaoMin = new XiaoMin();

        // 构造衣蛾动态代理
        DynamicProxy proxy = new DynamicProxy(xiaoMin);

        // 获取被代理类小民的ClassLoader
        ClassLoader classLoader = XiaoMin.class.getClassLoader();

        // 动态构建一个代理者律师
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(classLoader, XiaoMin.class.getInterfaces(), proxy);

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
