package com.sjxy.generic.jdk_proxy;

/**
 * @Author:王亚栋
 * @Date:2021/8/3 22:29
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {

        ProxyFactory factory = new ProxyFactory();

        SellTickets proxyObject = factory.getProxyObject();

        proxyObject.sell();




    }
}
