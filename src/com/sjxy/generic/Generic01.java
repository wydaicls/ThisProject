package com.sjxy.generic;

import java.util.ArrayList;

/**
 * @Author:王亚栋
 * @Date:2021/8/1 21:21
 * @Version:1.0
 */
public class Generic01 {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财1",15));
        arrayList.add(new Dog("旺财2",16));
        arrayList.add(new Dog("旺财3",17));
        arrayList.add(new Dog("旺财4",18));
        arrayList.add(new Cat("喵喵",20));

        for (Object o: arrayList) {
            //向下转型
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "-" +dog.getAge());

        }

    }
}

class Dog{
        private String name;

        private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat{
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
