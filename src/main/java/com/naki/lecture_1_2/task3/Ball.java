package com.naki.lecture_1_2.task3;

public class Ball implements Shape {

    //4/3PIr^3
    private double radius;

    @Override
    public double getVolume() {
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
