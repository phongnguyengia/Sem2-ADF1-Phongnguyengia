package com.company.javabai17.superclass;

public class Point {
   float x = 0.0f;
    private float y = 0.0f;
//    constructor

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0.0f;
        y = 0.0f;
    }
//    Getter Setter

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] XY = new float[2];
        this.x = XY[0];
        this.y = XY[1];
        return XY;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
