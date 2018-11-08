package com.cqgcxy.casestudy.case1;

/**
 * @author icechen1219
 * @date 2018/11/08
 */
public class TargetModel {

    public void test1(){
        long beginTime = System.currentTimeMillis();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test1 method executed finish...");

        long endTime = System.currentTimeMillis();
        System.out.println("test1 method used: "+(endTime-beginTime)+" milliseconds");
    }

    public void test2(){
        long beginTime = System.currentTimeMillis();

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test2 method executed finish...");

        long endTime = System.currentTimeMillis();
        System.out.println("test2 method used: "+(endTime-beginTime)+" milliseconds");
    }

    public void test3(){
        long beginTime = System.currentTimeMillis();

        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test3 method executed finish...");

        long endTime = System.currentTimeMillis();
        System.out.println("test3 method used: "+(endTime-beginTime)+" milliseconds");
    }
}
