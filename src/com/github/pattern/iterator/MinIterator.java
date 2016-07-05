package com.github.pattern.iterator;

import java.util.List;

/**
 * Created by JC on 2016-07-05.
 */
public class MinIterator implements Iterator<Employee> {
    private List<Employee> mList;
    private int postion;

    public MinIterator(List<Employee> list) {
        mList = list;
    }

    @Override
    public boolean hasNext() {
        return postion < mList.size();
    }

    @Override
    public Employee next() {
        Employee employee = mList.get(postion);
        postion++;

        return employee;
    }
}
