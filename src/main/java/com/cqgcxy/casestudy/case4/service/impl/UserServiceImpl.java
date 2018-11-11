package com.cqgcxy.casestudy.case4.service.impl;

import com.cqgcxy.casestudy.case4.service.UserService;

/**
 * @author icechen1219
 * @date 2018/11/11
 */
public class UserServiceImpl implements UserService {
    @Override
    public void login() {
        System.out.println(UserServiceImpl.class + " login...");
    }
}
