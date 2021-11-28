package com.sjxy.ex;

/**
 * @Author:王亚栋
 * @Date:2021/10/16 22:37
 * @Version:1.0
 */
public class MethodAndStack {

    public static void main(String[] args) {
        A();
    }

    private static void A() {
        A();
    }

    private static void B() {
        c();
    }

    private static void c() {

    }
}
