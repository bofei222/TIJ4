package test.java.concurrency;
/**
 * @author bofei
 * @date 2018年8月8日 上午9:38:33 
 */
class Ex1RunnerA implements Runnable{
    public Ex1RunnerA() {
        System.out.println("Constructing Ex1RunnerA");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hi from Ex1RunnerA");
            Thread.yield();
        }
        System.out.println("Ex1RunnerA task complete");
        return;
    }
}
class Ex1RunnerB implements Runnable{
    public Ex1RunnerB() {
        System.out.println("Constructing Ex1RunnerB");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hi from Ex1RunnerB");
            Thread.yield();
        }
        System.out.println("Ex1RunnerB task complete");
        return;
    }
}
class Ex1RunnerC implements Runnable{
    public Ex1RunnerC() {
        System.out.println("Constructing Ex1RunnerC");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hi from Ex1RunnerC");
            Thread.yield();
        }
        System.out.println("Ex1RunnerC task complete");
        return;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        new Thread(new Ex1RunnerA()).start();
        new Thread(new Ex1RunnerB()).start();
        new Thread(new Ex1RunnerC()).start();
    }
}
