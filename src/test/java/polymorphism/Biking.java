package test.java.polymorphism;

/**
 * @author bofei
 * @date 2018/8/31 9:21
 */
class Cycle {

    private String name = "Cycle";
    private int wheels = 0;
    public static void travel(Cycle c) {
        System.out.println("Cycle.ride() " + c);
    }

    public int getWheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}

class Unicycle extends Cycle {

    private String name = "Unicycle";
    private int wheels = 1;

    @Override
    public int getWheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}

class Bicycle extends Cycle {
    private String name = "Bicycle";
    private int wheels = 2;

    @Override
    public int getWheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }

}

class Tricycle extends Cycle {
    private String name = "Tricycle";
    private int wheels = 3;

    @Override
    public int getWheels() {
        return wheels;
    }

    public String toString() {
        return this.name;
    }
}

public class Biking {
    public static void ride(Cycle c) {
        c.travel(c);
    }
    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);
    }
}

