package com.sjxy.fanxin;

import java.util.ArrayList;

/**
 * 定义泛型类
 * @Author:王亚栋
 * @Date:2021/11/21 17:53
 * @Version:1.0
 */
public class Test01Test {

    public static void main(String[] args) {

        Test01<String> stringTest01 = new Test01<>();
        stringTest01.setT("haha");
        System.out.println(stringTest01.getT());

        Test02 test02 = new Test02();
        test02.setT("heihei");
        System.out.println(test02.getT());


        Test03 test03 = new Test03();
        String show = test03.show("bb");
        System.out.println(show);
        Integer show1 = test03.show(1);
        System.out.println(show1);


        Test04 test04 = new Test04();
        String wuwu = test04.show("wuwu");
        System.out.println(wuwu);

        Test06<String> stringTest06 = new Test06<>();
        System.out.println(stringTest06.show("sksk"));
        System.out.println(new Test06().show("lol"));

        ArrayList<Integer> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        strings.add(1);
        Test07 test07 = new Test07();
        test07.printList(strings);
        Test07 test071 = new Test07();
        test071.printList(integers);
        System.out.println("haha");
    }
}
