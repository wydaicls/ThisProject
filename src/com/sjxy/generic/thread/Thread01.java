package com.sjxy.generic.thread;

/**
 * @Author:王亚栋
 * @Date:2021/8/18 22:30
 * @Version:1.0
 */
public class Thread01 {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.start();//启动线程

    }
}
class Cat extends  Thread{

    int times = 0;

    @Override
    public void run() {

        while (true){

            System.out.println("喵喵~" +(++times) +"次" +"线程名：" +Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (times == 5){
                break;
            }
        }
    }
}