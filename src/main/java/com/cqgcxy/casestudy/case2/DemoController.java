package com.cqgcxy.casestudy.case2;

/**
 * @author icechen1219
 * @date 2018/11/08
 */
public class DemoController {
    private DemoService demoService = new DemoService();

    public void testService(){
        demoService.showMe();
    }
}
