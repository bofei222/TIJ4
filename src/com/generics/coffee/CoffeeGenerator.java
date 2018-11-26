package com.generics.coffee;

import java.util.*;
import net.mindview.util.Generator;

public class CoffeeGenerator
implements Generator<Coffee>, Iterable<Coffee>{
    private Class[] types = {
        Latte.class, Mocha.class, Cappuccino.class,
        Americano.class, Breve.class
    };
    
    private static Random rand = new Random(47);
    public CoffeeGenerator() {}
    // For iteration:
    private int size = 0;
    public CoffeeGenerator(int sz) { size = sz; }
    
    
    @Override
    public Iterator<Coffee> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee)
                types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    
}