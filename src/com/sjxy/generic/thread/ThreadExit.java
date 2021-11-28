package com.sjxy.generic.thread;

/**
 * @Author:王亚栋
 * @Date:2021/8/21 18:29
 * @Version:1.0
 */
public class ThreadExit {

    public static void main(String[] args) {

        T t = new T();
        t.start();

        //如果希望主线程控制T线程 终止
        System.out.println("主方法休眠10s");

        //让主线程休眠10s
        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.setLoop(false);
    }
}

class T extends Thread{

    private int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {

        while (loop){

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我是线程"+(++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
