package com.io.decorator;

public class Decorator3 implements Sourcable{
    private Sourcable sourcable;
    public Decorator3(Sourcable sourcable) {
        this.sourcable = sourcable;
    }
    @Override
    public void operation() {
        System.out.println("第三个装饰器前");
        sourcable.operation();
        System.out.println("第三个装饰器后");
    }
    
}
