package com.cqgcxy.casestudy.case3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author icechen1219
 * @date 2018/11/09
 */
public class Main {

    private Map<String, Object> map = new HashMap<>();

    {
        map.put("userId", 1);
        map.put("username", "zhangsan");
        map.put("password", "123456");
        map.put("age", 18);
        map.put("description", "my name is zhangsan, I'm from China.");
    }

    public static void main(String[] args) {
        Main demo = new Main();
        demo.doPost(demo.map);
    }

    public void doPost(Map<String, Object> parameterMap) {
        UserVo user = new UserVo();
        convert2User(parameterMap, user);

        System.out.println(user);
    }

    private void convert2User(Map<String, Object> parameterMap, UserVo user) {
        user.setUserId((Integer) parameterMap.get("userId"));
        user.setUsername((String) parameterMap.get("username"));
        user.setPassword((String) parameterMap.get("password"));
        user.setAge((Integer) parameterMap.get("age"));
        user.setDescription((String) parameterMap.get("description"));
    }

}
