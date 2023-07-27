package com.qa;

public class BadCalc {
    public int mult(int num1, int num2) {
        return num1*num2;
    }
    public int div(int num1, int num2) throws ArithmeticException {
        try {
            return num1 / num2;
        } catch (ArithmeticException ae) {
            System.out.println("Error: Division by zero " + ae);
            return -1;
        }
    }
}
