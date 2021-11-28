package com.sjxy.generic.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author:王亚栋
 * @Date:2021/9/21 14:25
 * @Version:1.0
 */
public class ThreadCallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadCallable threadCallable = new ThreadCallable();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(threadCallable);
        new Thread(integerFutureTask).start();
        Integer result = integerFutureTask.get();
        System.out.println(Thread.currentThread().getName()+","+result);
        LockSupport.park();
        //LockSupport.unpark();
    }
}
