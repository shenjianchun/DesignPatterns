package com.github.pattern.iterator;

/**
 * Created by JC on 2016-07-05.
 */
public class CompanyHui implements Company<Employee> {

    private Employee[] array = new Employee[3];

    public CompanyHui() {
        array[0] = new Employee("小李", 32, "男", "程序员");
        array[1] = new Employee("小韩", 30, "女", "UI");
        array[2] = new Employee("小木", 29, "男", "程序员");
    }

    @Override
    public Iterator<Employee> iterator() {
        return new HuiIterator(array);
    }
}
