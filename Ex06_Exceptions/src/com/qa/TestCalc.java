package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc b = new BadCalc();
        System.out.println(b.mult(6,3));
        System.out.println(b.div(6,3));
        System.out.println(b.div(6,0));
    }
}
