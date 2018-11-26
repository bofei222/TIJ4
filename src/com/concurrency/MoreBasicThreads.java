package com.concurrency;

/**
 * 你可以用更多的线程去驱动更多的任务
 * 
 * @author bofei
 * @date 2017年8月15日 下午5:13:54
 * 输出说明不同任务的执行在线程被换进换出时混在了一起。
 * 这种交换是由线程调度器自动控制的。
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}