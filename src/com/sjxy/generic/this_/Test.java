package com.sjxy.generic.this_;

/**
 * @Author:王亚栋
 * @Date:2021/8/14 15:07
 * @Version:1.0
 */
public class Test {

    public static void main(String[] args) {

        Dog dog1 = new Dog("大黄", 10);
        dog1.info();
        System.out.println(dog1.hashCode());

    }
}
