package com.composition;

/**
 * Created by eeexi on 2019/7/30.
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("使用 " + connection + " 添加产品");
    }

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}
