package com.cqgcxy.casestudy.case5;

import com.cqgcxy.casestudy.case5.service.MenuService;

/**
 * @author icechen1219
 * @date 2018/11/11
 */
public class Main {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        ProxyInterceptor proxy = new ProxyInterceptor();
        MenuService menuServiceProxy = (MenuService) proxy.createProxy(menuService);
        menuServiceProxy.buildTree();
    }
}
