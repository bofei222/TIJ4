package com.typeinfo;

import java.util.*;

abstract class Shape {
    // 如果对象出现在字符串表达式中，toString()会自动被调用
    void draw() { System.out.println(this + " .draw()"); }
    
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}


public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
            new Circle(), new Square(), new Triangle()
        );
        // 所有的类型转换都是在运行时进行正确检查的。
        // shape将执行什么代码 由引用所指向的具体类型决定
        for (Shape shape : shapeList)
            shape.draw();
    }
}