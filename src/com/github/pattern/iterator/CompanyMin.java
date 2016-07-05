package com.github.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JC on 2016-07-05.
 */
public class CompanyMin implements Company<Employee>{

    private List<Employee> list = new ArrayList<>();

    public CompanyMin() {
        list.add(new Employee("小民", 22, "男", "程序员"));
        list.add(new Employee("小惠", 28, "女", "测试"));
        list.add(new Employee("小三", 26, "女", "测试"));
        list.add(new Employee("小张", 33, "男", "产品"));
    }


    @Override
    public Iterator<Employee> iterator() {
        return new MinIterator(list);
    }
}
