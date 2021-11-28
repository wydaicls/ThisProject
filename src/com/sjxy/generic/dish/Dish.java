package com.sjxy.generic.dish;

/**
 * @Author:王亚栋
 * @Date:2021/9/23 21:54
 * @Version:1.0
 */
public class Dish {

    int id;

    String name;

    double price;

    public Dish(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
