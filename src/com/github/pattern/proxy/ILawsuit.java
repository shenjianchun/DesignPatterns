package com.github.pattern.proxy;

/**
 * 诉讼接口
 * Created by JC on 2016-07-08.
 */
public interface ILawsuit {
    // 提交申请
    void submit();
    // 进行举证
    void burden();
    // 开始辩护
    void defend();
    // 诉讼结束
    void finish();
}
