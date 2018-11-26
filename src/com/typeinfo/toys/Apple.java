package com.typeinfo.toys;

public class Apple {
    public static void main(String[] args) {
        Apple a = new Apple();
        Class c = null;
        Object o =null;
        try {
            c = Class.forName("com.typeinfo.toys.Apple");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
          //  com.typeinfo.toys.Apple cannot be cast to java.lang.Class
            c = (Class) c.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(c.getClass());
    }
}
