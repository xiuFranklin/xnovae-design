package com.liskov;

import java.util.HashMap;

/**
 * Created by eeexi on 2019/7/30.
 *
 * 定义：如果对每一个类型为 T1 的对象 o1，都有类型为 T2 的对象 o2， 使得以 T1 定义的所有程序 P 在所有的对象 o1 都替换成 o2 时，程序 P 的行为没有发生变化， 那么类型 T2 是类型 T1的子类型。

 提取关键词解读：

 T1 类有对象 o1
 T2 类有对象 o2
 P 程序
 当把程序中依赖 o1 对象全部替换成 o2 时，程序的行为没有发生变化。那么就可以认定为：T2 是 T1的子类型

 里氏替换原则是对开闭原则的一个补充：

 开闭原则：面向抽象编程，要抽象
 里氏替换原则：可以被替换，那么就有抽象；对实现抽象化的具体步骤规范

 同时也约束我们，子类的行为与父类应该保持一致，如果子类达不到这一点，那么子类就会违反里氏替换原则。
 */
public class Test {

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);

            System.out.println("width:" + rectangle.getWidth() +
                    "  length:" + rectangle.getLength());
        }
        System.out.println("resize 方法结束：width:" + rectangle.getWidth() +
                "  length:" + rectangle.getLength());
    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setLength(20);
//        rectangle.setWidth(10);
//        resize(rectangle);

//        Square square = new Square();
//        square.setSideLength(10);
//        resize(square);

        Child child = new Child();
        HashMap hashMap = new HashMap<>();
        child.method(hashMap);
    }
}
