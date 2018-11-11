package com.cqgcxy.casestudy.case4;

import com.cqgcxy.casestudy.case4.service.UserService;
import com.cqgcxy.casestudy.case4.service.impl.UserServiceImpl;

/**
 * @author icechen1219
 * @date 2018/11/11
 */
public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ProxyHandler proxy = new ProxyHandler();
        UserService userServiceProxy = (UserService) proxy.bind(userService);
        userServiceProxy.login();
    }
}
