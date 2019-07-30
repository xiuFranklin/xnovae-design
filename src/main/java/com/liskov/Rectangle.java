package com.liskov;

/**
 * Created by eeexi on 2019/7/30.
 */
public class Rectangle implements Quadrangle{

    private long length;
    private long width;

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getLength() {
        return 0;
    }

    @Override
    public long getWidth() {
        return 0;
    }
}
