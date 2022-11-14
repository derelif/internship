package com.naki.lecture_1_2.task3;

public class Cube implements Shape {

    //A^3
    private double width;

    @Override
    public double getVolume() {
        return Math.pow(width,3);
    }

    public Cube(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
