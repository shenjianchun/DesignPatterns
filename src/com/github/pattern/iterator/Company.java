package com.github.pattern.iterator;

/**
 * Created by JC on 2016-07-05.
 */
public interface Company<T> {
    /**
     * 返回一个迭代器对象
     * @return 迭代器对象
     */
    Iterator<T> iterator();
}
