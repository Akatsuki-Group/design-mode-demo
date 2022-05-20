package org.example.specification.demo3;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
//待分析的对象
        ArrayList<Object> list = new ArrayList<Object>();
//定义两个业务规格书
        ISpecification spec1 = new BizSpecification(new Object());
        ISpecification spec2 = new BizSpecification(new Object());
//规则的调用
        for (Object obj : list) {
            if (spec1.and(spec2).isSatisfiedBy(obj)) { //and操作
                System.out.println(obj);
            }
        }
    }
}