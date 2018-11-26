package com.io.decorator;

public class Decorator1 implements Sourcable{
    private Sourcable sourcable;
    public Decorator1(Sourcable sourcable) {
        this.sourcable = sourcable;
    }
    @Override
    public void operation() {
        System.out.println("第一个装饰器前");
        sourcable.operation();
        System.out.println("第一个装饰器后");
    }
    
}
