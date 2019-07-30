package com.composition;

/**
 * Created by eeexi on 2019/7/30.
 */
public class PostgreesqlDBConnection implements DBConnection{


    @Override
    public String getConnection() {
        return "使用 Postgreesql 数据库连接";
    }
}
