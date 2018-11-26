package com.polymorphism;

/**
 * @author bofei
 * @date 2018/8/31 13:52
 */
class SuperA {
    private int sex = 1;
    private int age;

    public int getSex() {
        return sex;
    }
}
class SubA extends SuperA {
    private String name;
    private int sex = 2;

    @Override
    public int getSex() {
        return sex;
    }
}
public class Test {
    public static void main(String[] args) {
        SuperA spa = new SubA();
        System.out.println(spa.getSex());
    }
}
