package com.sjxy.generic.singleton.type3;

/**
 * @Author:王亚栋
 * @Date:2021/8/2 23:10
 * @Version:1.0
 */
public class SingletonTest03 {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class Singleton{

    private static Singleton instance;

    private Singleton(){

    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    //即懒汉式
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
