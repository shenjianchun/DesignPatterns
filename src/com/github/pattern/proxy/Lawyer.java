package com.github.pattern.proxy;

/**
 * 代理律师
 * Created by JC on 2016-07-08.
 */
public class Lawyer implements ILawsuit {

    private ILawsuit mILawsuit;

    public Lawyer(ILawsuit ILawsuit) {
        mILawsuit = ILawsuit;
    }

    @Override
    public void submit() {
        mILawsuit.submit();
    }

    @Override
    public void burden() {
        mILawsuit.burden();
    }

    @Override
    public void defend() {
        mILawsuit.defend();
    }

    @Override
    public void finish() {
        mILawsuit.finish();
    }
}
