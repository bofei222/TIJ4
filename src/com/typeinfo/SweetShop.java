package com.typeinfo;
import static net.mindview.util.Print.*;

class Candy{
    static {
        System.out.println("Candy.static initializer");
    }
}
class Gum {
    static {
        System.out.println("Gum.static initializer");
    }
}
class Cookie {
    static {
        System.out.println("Cookie.static initializer");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try {
            Class.forName("com.typeinfo.Gum");
        } catch (ClassNotFoundException e) {
            print("Could't find Gum");
        }
        print("After Class.forName(\"Gum\")");
        new Cookie();
        print("After creating Cookie");
    }
}
