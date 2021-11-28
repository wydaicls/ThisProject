package com.sjxy.generic.this_;

/**
 * @Author:王亚栋
 * @Date:2021/8/14 15:02
 * @Version:1.0
 */
public class Dog {

    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void  info(){
        System.out.println(this.name + this.age + "当前对象的hashcode值为："+this.hashCode());
    }
}
