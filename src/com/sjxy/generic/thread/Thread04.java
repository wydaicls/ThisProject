package com.sjxy.generic.thread;

/**
 * @Author:王亚栋
 * @Date:2021/8/22 16:35
 * @Version:1.0
 */
public class Thread04 {

    public static void main(String[] args) throws InterruptedException {

        T2 t1 = new T2();
        //开启守护线程
        t1.setDaemon(true);
        System.out.println(t1.getState());
        t1.start();

        for (int i = 1; i <= 20; i++) {

            Thread.sleep(1000);
            System.out.println("宝强在努力的挣钱");
        }


    }
}

class T2 extends Thread{

    @Override
    public void run() {

        for (;;) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("马蓉和宋哲在快乐的聊天");
            
        }
    }
}
