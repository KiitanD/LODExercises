package com.qa;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(String name, String colour, double x, double y, double width, double height) {
        super(name, colour, x, y);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return height * width;
    }

    @Override
    Point getCentrePoint() {
        return new Point(this.getX() + (width/2), this.getY() + (height/2));
    }

    @Override
    public String toString() {
        return "Rectangle{" + this.getName() + this.getX() + this.getY() + this.getHeight() + this.getWidth() + "}";
    }

    public boolean isSquare() {
        if (this.getHeight() == this.getWidth()) {
            return true;
        }
        return false;
    }
}
