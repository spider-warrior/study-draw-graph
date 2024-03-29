package com.jy.draw.graph.entity;

/**
 * 像素
 * */
public class Pix {
    /**
     * width
     * */
    private int x;

    /**
     * height
     * */
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Pix(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pix{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
