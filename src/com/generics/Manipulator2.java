package com.generics;

/**
 * @author bofei
 * @date 2018/8/22 17:22
 */
public class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T obj) {
        this.obj = obj;
    }
    public void manipulate() {
        obj.f();
    }
}
