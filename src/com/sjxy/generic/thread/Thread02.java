package com.sjxy.generic.thread;

/**
 * @Author:王亚栋
 * @Date:2021/8/21 17:00
 * @Version:1.0
 */
public class Thread02 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable{

    int count = 0;

    @Override
    public void run() {



        while (true){

            System.out.println("小狗汪汪叫..."+(++count)+"次" +Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count > 10){
                break;
            }
        }
    }
}