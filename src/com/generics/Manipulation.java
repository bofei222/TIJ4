package com.generics;

/**
 * @author bofei
 * @date 2018/8/22 17:17
 */
public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();
    }
}

class Manipulator<T> {
    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }
    public void manipulate() {
//        obj.f();
    }
}

