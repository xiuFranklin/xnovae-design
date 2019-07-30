package com.composition;

/**
 * Created by eeexi on 2019/7/30.
 *
 * 合成（组合）/ 聚合复用原则

 定义：尽量使用对象组合/聚合，而不是继承关系达到软件复用的目的

 聚合 has-A
 组合 contains-A
 继承 is-A
 优点：可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响相对较少

 聚合：除了 a 类以外，还有其他地方对 b 类的引用，就算 a 类结束了，b 还存活着
 组合：只有 a 类引用，那么当 a 类结束时， b 类跟着一起结束
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new MysqlDBConnection());
//        productDao.setDbConnection(new PostgreesqlDBConnection());
        productDao.addProduct();
    }
}
