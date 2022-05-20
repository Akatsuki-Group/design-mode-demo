package org.example.proxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayInvocationHandler implements InvocationHandler {
    //被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;

    //我要代理谁
    public GamePlayInvocationHandler(Object _obj) {
        this.obj = _obj;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}