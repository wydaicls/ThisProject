package com.xiangxue;

/**
 * @Author:王亚栋
 * @Date:2021/10/24 18:59
 * @Version:1.0
 */
public class Demo1_1 {

    public static void main(String[] args) {

        method1();
    }

    private static void method1() {
        method2(1,2);
    }

    private static int method2(int a,int b) {

        int c = a + b;
        return c;
    }
}
