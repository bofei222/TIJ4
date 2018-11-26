package com.typeinfo;

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.random.nextInt(1000);
    static {
        System.out.println("Initable.static initializer");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initalbe2.static initializer");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initable3.static initializer");
    }
}

public class ClassInitialization {
    public static Random random = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        Class initalbe = Initable.class;
        System.out.println("After creating Initable ref");
        //
        System.out.println(Initable.staticFinal);
        //
        System.out.println(Initable.staticFinal2);
        //
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.typeinfo.Initable3");

        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);
    }
}