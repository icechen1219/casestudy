package com.cqgcxy.casestudy.case3;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * @author icechen1219
 * @date 2018/11/09
 */
public class ReflectUtils {

    public static void map2Entity(Map<String, Object> map, Object entity) {
        if (entity == null) {
            return;
        }
        Class<?> entityClass = entity.getClass();
        Field[] declaredFields = entityClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            String fieldName = declaredField.getName();
            Object value = map.get(fieldName);

            declaredField.setAccessible(true);
            try {
                declaredField.set(entity,value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
