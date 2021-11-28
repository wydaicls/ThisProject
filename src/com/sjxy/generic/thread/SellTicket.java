package com.sjxy.generic.thread;

/**
 * @Author:王亚栋
 * @Date:2021/8/21 18:12
 * @Version:1.0
 * 模拟多线程 开三个窗口卖票100张
 */
public class SellTicket {
    public static void main(String[] args) {

        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();
        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
    }
}

class SellTicket01 extends Thread{

    private static int ticketNum = 100;

    @Override
    public void run() {

        while (true){
            if (ticketNum <= 0){
                System.out.println("售票结束...");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName()+"售出了一张票"+"剩余票数=" +(--ticketNum));

        }
    }
}