package com.sjxy.ex;

/**
 * @Author:王亚栋
 * @Date:2021/10/16 23:11
 * @Version:1.0
 */
public class Person {


    public int work() throws Exception{
        int x = 1;
        int y = 2;
        int z = (x+y) * 10;
        System.out.println("哈哈"+z);
        return z;

    }
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.work();
        person.hashCode();
    }
}
