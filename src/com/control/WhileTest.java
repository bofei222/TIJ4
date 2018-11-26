package com.control;

public class WhileTest {
    static boolean condition() {
        double d = Math.random();
        System.out.println(d);
        boolean result = d < 0.99;
        System.out.print(result + ", ");
        return result;
    }
    
    public static void main(String[] args) {
        while (condition())
            System.out.println("while循环内");
        System.out.println("while循环外");
    }
}
