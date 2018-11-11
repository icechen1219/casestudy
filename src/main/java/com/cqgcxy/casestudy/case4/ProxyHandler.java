package com.cqgcxy.casestudy.case4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author icechen1219
 * @date 2018/11/11
 */
public class ProxyHandler implements InvocationHandler {
    private Object target;

    public Object bind(Object target) {
        if (target == null) {
            throw new RuntimeException("传入对象不能为空！");
        }
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        System.out.println("拦截了[" + method.getName() + "]方法...");
        result = method.invoke(target, args);
        System.out.println("[" + method.getName() + "]方法拦截结束...");
        return result;
    }
}
