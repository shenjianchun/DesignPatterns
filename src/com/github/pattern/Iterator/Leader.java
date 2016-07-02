package com.github.pattern.Iterator;

/**
 * 抽象领导者
 * Created by JC on 2016-07-02.
 */
public abstract class Leader {

    protected Leader nextLeader;

    public final void handleRequest(int money) {

        if (money <= limit()) {
            handle(money);
        } else {
            if (nextLeader != null) {
                nextLeader.handleRequest(money);
            }
        }
    }

    /**
     * 自身能够批复的额度权限
     * @return 额度
     */
    public abstract int limit();

    /**
     * 处理报账行为
     * @param money 具体金额
     */
    public abstract void handle(int money);
}
