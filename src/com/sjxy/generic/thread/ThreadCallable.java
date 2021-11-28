package com.sjxy.generic.thread;

import java.util.concurrent.Callable;

/**
 * @Author:王亚栋
 * @Date:2021/9/21 14:23
 * @Version:1.0
 */
public class ThreadCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        try{

            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println(Thread.currentThread().getName()+"返回结果是1");
        return 1;
    }
}
