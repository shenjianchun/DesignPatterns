package com.github.pattern.iterator;

/**
 * Created by JC on 2016-07-05.
 */
public class HuiIterator implements Iterator<Employee> {
    private Employee[] array;
    private int position = 0;

    public HuiIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.length ;
    }

    @Override
    public Employee next() {
        Employee employee = array[position];
        position++;

        return employee;
    }
}
