package com.sjxy.fanxin;

/**
 * 定义泛型类
 *      public class 类名<T>{}
 *          T可以任意写为  T,E,K,V等形式的参数常用于表示泛型
 * @Author:王亚栋
 * @Date:2021/11/21 17:52
 * @Version:1.0
 */
public class Test01<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
