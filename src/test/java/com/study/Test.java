package com.study;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by zbl on 2017/6/20.
 */
public class Test {
    public static void main(String[] args) {
        int num = 45;
        //方法1、
        int wanWei = num / 10000;
        int qianWei = num % 10000 / 1000;
        int baiWei = num % 1000 / 100;
        int shiWei = num % 100 / 10;
        StringBuilder builder = new StringBuilder();
        builder.append(wanWei != 0 ? wanWei : "").append(qianWei != 0 ? qianWei : "").append(baiWei != 0 ? baiWei : "").append(shiWei != 0 ? shiWei : "").append(0);
        System.out.println(builder);

    }
}
