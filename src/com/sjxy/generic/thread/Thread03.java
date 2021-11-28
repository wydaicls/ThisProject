package com.sjxy.generic.thread;

/**
 * @Author:王亚栋
 * @Date:2021/8/22 16:35
 * @Version:1.0
 */
public class Thread03 {

    public static void main(String[] args) throws InterruptedException {

        T1 t1 = new T1();
        t1.start();

        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);

            System.out.println("主线程在吃包子"+i);

            if (i == 5){
                System.out.println("主线程让子线程先吃");
                t1.join();

            }
        }


    }
}

class T1 extends Thread{

    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程在吃包子"+i);
            
        }
    }
}
