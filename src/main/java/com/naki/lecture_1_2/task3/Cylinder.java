package com.naki.lecture_1_2.task3;

public class Cylinder implements Shape {

    //PIr^2h
    private double radius;
    private double height;

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
