package test.java.typeinfo;

import static net.mindview.util.Print.print;

/**
 * @author bofei
 * @date 2018/8/10 13:54
 */
interface Interface {
    void doSomething();

    void somethingElse(String arg);
}
class RealObject implements Interface {
    @Override
    public void doSomething() {
        print("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}
class SimpleProxy implements Interface {
    private Interface proxied;
    private static int doCount = 0;
    private static int sECount = 0;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        print("SimleProxy doSomething " + doCount);
        doCount++;
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        print("SimpleProxy somethingElse " + arg);
        sECount++;
        proxied.somethingElse(arg);
    }
}
class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        print();
        consumer(new SimpleProxy(new RealObject()));
        print();
        consumer(new SimpleProxy(new RealObject()));
        print();
        consumer(new SimpleProxy(new RealObject()));

    }
}