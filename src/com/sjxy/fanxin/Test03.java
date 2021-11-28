package com.sjxy.fanxin;

/**
 * @Author:王亚栋
 * @Date:2021/11/21 18:12
 * @Version:1.0
 */
public class Test03 {

//    public String show(String a){
//        return a;
//    }
//    public Integer show(Integer a){
//        return a;
//    }

    /**
     *  public  修饰符
     *  void    返回值
     * @param t
     * @param <T>  该方法使用泛型T
     */
    public <T> T show(T t){
        System.out.println("Test03里面的show");
        return t;
    }
}
