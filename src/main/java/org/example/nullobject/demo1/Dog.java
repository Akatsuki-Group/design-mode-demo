package org.example.nullobject.demo1;

//定义一个小狗
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Wang Wang Wang !");
    }
}