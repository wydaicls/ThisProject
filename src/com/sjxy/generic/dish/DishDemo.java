package com.sjxy.generic.dish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author:王亚栋
 * @Date:2021/9/23 21:57
 * @Version:1.0
 */
public class DishDemo {

    static List<Dish> dishList = new ArrayList<>();

    static List<Dish> personDishList = new ArrayList<>();

    public static void main(String[] args) {


        initDish();

        Scanner sc = new Scanner(System.in);

        while (true){
            showMenu();
            int num = sc.nextInt();

            switch (num){
                case 1:
                    while (true) {
                        showDishMenu();

                        int id = sc.nextInt();

                        if (id == 0){
                            break;
                        }
                        Dish dish = dishList.get(id - 1);
                        System.out.println("亲，您点了"+dish.name+"菜");
                        //用户点一个，存储一个
                        personDishList.add(dish);
                    }
                case 2:
                    showPersonDish();
                    break;
                case 3:
                    buy();
                    return;
            }
        }



    }

    //结账
    private static void buy() {

        int totalPrice = 0;

        for (Dish dish :personDishList) {

            double price = dish.price;

            totalPrice += price;

        }
        System.out.println("总计费用为："+totalPrice);

    }

    //已点菜品
    private static void showPersonDish() {
        for (int i = 0; i < personDishList.size(); i++) {

            System.out.println(personDishList.get(i));
        }
    }

    private static void showDishMenu() {
        System.out.println("======请您点菜=======");
        for (int i = 0; i < dishList.size(); i++) {

            Dish dish = dishList.get(i);
            System.out.println(dish.id +"\t"+ dish.name +"\t"+ dish.price);
        }
        System.out.println("==输入序号点菜，输入0返回上级==");
    }

    private static void showMenu() {
        System.out.println("=====主菜单=====");
        System.out.println("菜单\t\t\t 1");
        System.out.println("已点菜品\t\t 2");
        System.out.println("结账\t\t\t 3");
        System.out.println("请输入编号：");
    }

    private static void initDish() {

        Dish dish1 = new Dish(1,"麻辣香菇",23.5);
        Dish dish2 = new Dish(2,"青椒肉丝",18.5);
        Dish dish3 = new Dish(3,"麻辣虾尾",65.5);
        Dish dish4 = new Dish(4,"红烧茄子",35.5);
        Dish dish5 = new Dish(5,"油焖大虾",55.5);

        dishList.add(dish1);
        dishList.add(dish2);
        dishList.add(dish3);
        dishList.add(dish4);
        dishList.add(dish5);

    }
}
