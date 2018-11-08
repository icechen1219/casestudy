package com.cqgcxy.casestudy.case1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author icechen1219
 * @date 2018/11/08
 */
public class TargetProxy {

    public void delegateMethod(Object targetObject, String methodName) {
        Class objectClass = targetObject.getClass();
        try {

            Method method = objectClass.getDeclaredMethod(methodName);
            method.setAccessible(true);
            long beginTime = System.currentTimeMillis();

            System.out.println("通过代理类执行...");
            method.invoke(targetObject);

            long endTime = System.currentTimeMillis();
            System.out.println(methodName + " method used: " + (endTime - beginTime) + " milliseconds");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
