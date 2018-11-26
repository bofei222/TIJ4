package com.concurrency;

/**
 * 这个任务不是由单独的线程驱动的，它是在main()中直接调用的。
 * @author bofei
 * @date 2017年8月15日 下午5:17:08
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
