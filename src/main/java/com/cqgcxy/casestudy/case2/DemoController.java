package com.cqgcxy.casestudy.case2;

/**
 * @author icechen1219
 * @date 2018/11/08
 */
public class DemoController {
    @Autowired
    private DemoService demoService;

    private DemoService demoService2;

    public void testService() {
        if (demoService != null) {
            demoService.showMe();
        } else{
            System.out.println("demoService is null");
        }

        if (demoService2 != null) {
            demoService.showMe();
        } else{
            System.out.println("demoService2 is null");
        }
    }
}
