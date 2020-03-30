package com.company.javabai17.superclass;

public class Shape {
    private String color;
    private boolean filled;

    //    COnstructor
    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
//    Getter Setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "Shape[color= "
                + this.color
                + ", filled= "
                + this.filled
                + "]";
    }
}
