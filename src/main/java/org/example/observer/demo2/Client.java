package org.example.observer.demo2;

public class Client {
    public static void main(String[] args) {
        //定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        //然后我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
        //韩非子娱乐了
        hanFeiZi.haveFun();
    }
}