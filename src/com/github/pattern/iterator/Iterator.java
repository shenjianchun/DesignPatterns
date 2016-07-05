package com.github.pattern.iterator;

/**
 * 迭代器接口
 * Created by JC on 2016-07-05.
 */
public interface Iterator<T> {

    /**
     * 是否还有下一个元素
     * @return true表示有，false表示没有
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素，并将位置移至下一位
     * @return
     */
    T next();

}
