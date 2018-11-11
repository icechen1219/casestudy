package com.cqgcxy.casestudy.case5;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author icechen1219
 * @date 2018/11/11
 */
public class ProxyInterceptor implements MethodInterceptor {


    public Object createProxy(Object target) {
        if (target == null) {
            throw new RuntimeException("被代理对象不能为空！");
        }
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setClassLoader(target.getClass().getClassLoader());
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result;
        System.out.println("拦截了[" + method.getName() + "]方法...");
        result = methodProxy.invokeSuper(o, objects);
        System.out.println("[" + method.getName() + "]方法拦截结束...");
        return result;
    }
}
