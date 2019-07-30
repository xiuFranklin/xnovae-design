package com.composition;

/**
 * Created by eeexi on 2019/7/30.
 */
public class MysqlDBConnection implements DBConnection{


    @Override
    public String getConnection() {
        return "使用 Mysql 数据库连接";
    }
}
