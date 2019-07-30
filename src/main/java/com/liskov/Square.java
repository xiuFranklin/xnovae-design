package com.liskov;

/**
 * Created by eeexi on 2019/7/30.
 * 正方形：来验证在某些场景下，正方形是否是长方形
 */
public class Square implements Quadrangle{

    // 边长：正方形的长宽是一样的
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }


    @Override
    public long getLength() {
        return getSideLength();
    }

    @Override
    public long getWidth() {
        return getSideLength();
    }
}
