package com.io.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Sourcable source = new Source();
        
        
        Sourcable obj = new Decorator1(new Decorator2(new Decorator3(source)));
        obj.operation();
    }

}
