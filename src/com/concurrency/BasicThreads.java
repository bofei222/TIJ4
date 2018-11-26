package com.concurrency;

/**
 * 调用Thread对象的start()方法为该线程执行必需的初始化操作，
 * 然后调用Runnable的run()方法，以便在这个新线程中启动该任务。
 * LiftOff.run()是由不同的线程执行的，
 * 因为你仍旧可以执行main()线程中的其他操作。
 * @author bofei
 * @date 2017年8月15日 下午5:14:59
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
