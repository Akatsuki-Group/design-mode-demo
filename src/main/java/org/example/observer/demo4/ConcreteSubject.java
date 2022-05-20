package org.example.observer.demo4;

public class ConcreteSubject extends Subject {
    //具体的业务
    public void doSomething() {
        /*
         * do something
         */
        System.out.println("我发送了一条消息");
        super.notifyObservers();
    }
}