package com.liskov;

import java.util.Map;

/**
 * Created by eeexi on 2019/7/30.
 */
public class Child extends Base{
    /**  重写 */
//    @Override
//    public void method(HashMap hashMap) {
//        System.out.println("子类 HashMap 被执行");
//    }

    /** 重载 */
    public void  method(Map map){
        System.out.println("子类 Map 被执行");
    }
}
