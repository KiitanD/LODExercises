package com.qa;

public class Circle extends Shape implements Movable{
    private double radius;
    public Circle(String name, String colour, double x, double y, double radius) {
        super(name, colour, x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return java.lang.Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    Point getCentrePoint() {
        return new Point(this.getX(), this.getY());
    }

    @Override
    public String toString() {
        return "Circle" + "\nx: " + this.getX() + "\ny: " + this.getY() + "\nradius: " + radius +"\nArea: " + this.getArea() + "\nCentre: " + this.getCentrePoint();
    }

    public Point getCurrentLocation() {
        return getCentrePoint();
    }

    public void move(double x, double y) {
        setX(getX()+x); 
        setY(getY()+y);
    }
}
