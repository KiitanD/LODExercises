package com.qa;

public class Main {
    public static void main(String[] args) {
        Rectangle p = new Rectangle("One", "blue", 5, 10, 10, 20);
        System.out.println(p);
        System.out.println(p.getArea());
        System.out.println(p.getCentrePoint());
    }
}
