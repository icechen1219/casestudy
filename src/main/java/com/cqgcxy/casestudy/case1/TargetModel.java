package com.cqgcxy.casestudy.case1;

/**
 * @author icechen1219
 * @date 2018/11/08
 */
public class TargetModel {

    public void test1(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test1 method executed finish...");
    }

    public void test2(){
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test2 method executed finish...");
    }

    public void test3(){
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test3 method executed finish...");
    }
}
