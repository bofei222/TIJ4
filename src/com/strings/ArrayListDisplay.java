package com.strings;

import java.util.ArrayList;

import com.generics.coffee.Coffee;
import com.generics.coffee.CoffeeGenerator;

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for (Coffee c : new CoffeeGenerator(10))
            coffees.add(c);
        System.out.println(coffees);
    }
}