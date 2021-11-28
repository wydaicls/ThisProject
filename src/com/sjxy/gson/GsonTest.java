package com.sjxy.gson;

import com.google.gson.Gson;

/**
 * @Author:王亚栋
 * @Date:2021/11/17 21:13
 * @Version:1.0
 */
public class GsonTest {



    static class GsonBean{

        public int i;
        public String str;

        @Override
        public String toString() {
            return "GsonBean{" +
                    "i=" + i +
                    ", str='" + str + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Gson gson = new Gson();
        System.out.println(gson.toJson(1));
        System.out.println(gson.toJson("zero"));

        int[] values = {1,2,3};
        System.out.println(gson.toJson(values));

        Integer i = gson.fromJson("1", int.class);
        System.out.println("i="+i);

        GsonBean gsonBean = new GsonBean();
        gsonBean.i = 2;
        gsonBean.str = "哈哈";

        String json = gson.toJson(gsonBean);
        System.out.println("json = "+json);

        GsonBean gsonBean1 = gson.fromJson(json, GsonBean.class);
        System.out.println("gsonBean1 = "+gsonBean1);

    }
}
