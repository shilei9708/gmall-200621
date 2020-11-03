package com.atguigu.utils;

import java.util.Random;

/**
 * @author MingYue
 * @create 2020-11-03 15:37
 */
public class RandomNum {
    public static int getRandInt(int fromNum,int toNum){
        return fromNum + new Random().nextInt(toNum-fromNum+1);
    }
}

