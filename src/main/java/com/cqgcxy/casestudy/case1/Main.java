package com.cqgcxy.casestudy.case1;

/**
 * @author icechen1219
 * @date 2018/11/08
 */
public class Main {
    public static void main(String[] args) {
        TargetModel target=new TargetModel();
        TargetProxy proxy=new TargetProxy();
        proxy.delegateMethod(target, "test1");
        proxy.delegateMethod(target, "test2");
        proxy.delegateMethod(target, "test3");
    }
}
