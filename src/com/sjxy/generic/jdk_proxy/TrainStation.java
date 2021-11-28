package com.sjxy.generic.jdk_proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:王亚栋
 * @Date:2021/8/3 22:19
 * @Version:1.0
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
        Map map = new HashMap<>();
    }
}
