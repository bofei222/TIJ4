package test.java.polymorphism;

import static net.mindview.util.Print.print;

/**
 * @author bofei
 * @date 2018/8/30 15:42
 */

class Rectangle extends Shape {
    @Override
    public void draw() {
        print("Rectangle.draw()");
    }

    @Override
    public void erase() {
        print("Rectangle.erase()");
    }

    @Override
    public void amend() {
        print("Rectangle.amend()");
    }
}

public class Shapes4 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp :
                s) {
            shp.draw();
        }
    }
}
