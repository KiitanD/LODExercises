package com.qa;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle("One", "blue", 5, 10, 10, 20);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getCentrePoint());

        Circle c = new Circle("Two", "red", 5, 10, 5);
        System.out.println(c);
        System.out.println("");
        System.out.println(c.getArea());
        System.out.println(c.getCentrePoint());
    }
}
