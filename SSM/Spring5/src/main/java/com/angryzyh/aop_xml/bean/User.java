package com.angryzyh.aop_xml.bean;

public class User {
    public int add(int a, int b) {
        /*用于触发异常通知*/
        //int m = a/0;
        System.out.println("执行user中的add方法");
        return a + b;
    }
}
