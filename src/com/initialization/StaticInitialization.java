package com.initialization;

import net.mindview.util.RandomGenerator;

import java.util.Random;

import static net.mindview.util.Print.*;

class Bowl {

    Bowl(int marker) {
        print("Bowl(" + marker + ")");

    }

    void f1(int marker) {
        print("f1(" + marker + ")");
    }
}
class Table {

    static Bowl bowl1 = new Bowl(1);

    Table() {
        print("Table()");
    }

    void f2(int marker) {
        print("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}
class Cupboard {

    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        print("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        print("f 3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}
public class StaticInitialization {
    public static void main(String[] args) {
        print("Creating new Cupboard() in main");
        new Cupboard();
        print("Creating new Cupboard() in main");
        new Cupboard();

    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}