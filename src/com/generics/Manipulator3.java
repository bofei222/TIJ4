package com.generics;

/**
 * @author bofei
 * @date 2018/8/22 17:24
 */
public class Manipulator3 {
    private HasF obj;

    public Manipulator3(HasF x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
}
