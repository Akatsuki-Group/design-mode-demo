package org.example.chain.demo1;

import org.example.chain.demo1.IHandler;
import org.example.chain.demo1.IWomen;

public class Father implements IHandler {
    //未出嫁的女儿来请示父亲
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}