package org.example.template.demo1;

import org.example.template.demo1.AbstractClass;
import org.example.template.demo1.ConcreteClass1;
import org.example.template.demo1.ConcreteClass2;

public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        //调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
