package test.java.polymorphism;

/**
 * @author bofei
 * @date 2018/8/31 9:27
 */
public class Biking5 {

    public static void ride(Cycle c) {
        c.travel(c);
        System.out.println("wheels: " + c.getWheels());
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u); // upcast to Cycle
        ride(b);
        ride(t);
    }
}
