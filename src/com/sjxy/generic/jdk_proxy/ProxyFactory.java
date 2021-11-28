package com.sjxy.generic.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:王亚栋
 * @Date:2021/8/3 22:20
 * @Version:1.0
 * 获取代理对象的工厂类
 */
public class ProxyFactory {

    //声明目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        /**
         * ClassLoader loader,
         * Class<?>[] interfaces,
         * InvocationHandler h
         */
        //返回代理对象即可
        SellTickets proxyObject =(SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点需要缴纳手续费");
                        Object invoke = method.invoke(station, args);
                        return invoke;
                    }
                }
        );
        return proxyObject;
    }
}
