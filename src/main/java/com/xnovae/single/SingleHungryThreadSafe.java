package com.xnovae.single;

/**
 * Created by eeexi on 2019/7/23.
 *
 *  单例 饿汉模式：
 *
 *  特点：

   （1）非 Lazy 初始化
   （2）多线程安全
    优点：没有加锁，执行效率会提高。 缺点：类加载时就初始化，浪费内存。
 */
public class SingleHungryThreadSafe {

    private static SingleHungryThreadSafe singleHungryThreadSafe = new SingleHungryThreadSafe();

    private SingleHungryThreadSafe(){

    };

    public static SingleHungryThreadSafe getInstance(){
        return  singleHungryThreadSafe;
    };
}
