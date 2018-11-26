package com.concurrency;

/**
 * 线程可以驱动任务，
 * 因此你需要一种描述任务的方式，这可以由Runnable接口来提供。
 * 标识符id用来区分多个任务的实例
 * @author bofei
 * @date 2017年8月15日 下午5:18:02
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    public static int taskCount = 0;
    private final static int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }
    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }
    }
    
}