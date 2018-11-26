package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executor(执行器)将为你管理Thread对象。
 * Executor在客户端和任务执行之间提供了一个间接层。
 * 与命令设计模式一样，它暴露了要执行的单一方法。
 * @author bofei
 * @date 2017年8月15日 下午5:29:10 
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
