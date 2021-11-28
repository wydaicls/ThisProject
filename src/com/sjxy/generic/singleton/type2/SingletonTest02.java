package com.sjxy.generic.singleton.type2;

/**
 * @Author:王亚栋
 * @Date:2021/8/2 22:16
 * @Version:1.0
 */
public class SingletonTest02 {

    public static void main(String[] args) {


        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());

    }
}

//饿汉式(静态变量)
class Singleton{
    //1.构造器私有化，防止外部new
    private Singleton(){


    }

    //2.本类内部创建对象实例
    private  static Singleton instance;

    //在静态代码块中，创建单例对象
    static {
        instance = new Singleton();
    }
    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
