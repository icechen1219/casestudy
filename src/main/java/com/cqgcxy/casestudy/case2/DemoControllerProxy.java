package com.cqgcxy.casestudy.case2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author icechen1219
 * @date 2018/11/08
 */
public class DemoControllerProxy {
    private Object targetObject;

    public DemoControllerProxy(Object targetObject) {
        this.targetObject = targetObject;
        ioc();
    }

    private void ioc(){
        Class objectClass = targetObject.getClass();
        Field[] declaredFields = objectClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Autowired autowired = declaredField.getAnnotation(Autowired.class);
            // 如果没有添加注解，就不自动赋值
            if (autowired == null) {
                continue;
            }

            Class fieldType = declaredField.getType();
            try {
                // 根据成员变量的类型，调用其无参构造方法动态创建其实例，并赋值给该成员变量
                Object value = fieldType.getConstructor().newInstance();
                declaredField.setAccessible(true);
                declaredField.set(targetObject, value);
                System.out.println("动态给成员变量："+declaredField.getName()+"赋值成功...");
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }
}
