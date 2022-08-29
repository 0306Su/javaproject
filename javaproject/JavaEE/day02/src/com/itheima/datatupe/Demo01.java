package com.itheima.datatupe;

import java.util.Scanner;

/**
 * @author admin
 * @Classname Demo
 * @Version 1.0.0
 * @Date 2022/8/28 11:03
 */
public class Demo01 {
    public static void main(String[] args) {
        //目标掌握数字类型的分类
        //重点掌握基本类型的分类，四大类八种
        //byte 占一个字节，取值范围-128-127
        byte age = -128;
        byte age1 = 127;
        byte age2 = 0;
//        byte age3 = 128;

        //short 短整型占2个字节
        short money = 30000;
//        short money1 = 350000;

        //int 整型 占四个字节 是整数的默认值
        int number = 1324567890;
//        int number1 = 13245678900;

        //long 长整型 占8 个字节
        long data = 1324567890;

        //随便写一个整数字面量，会被当成int类型，如果想让他成为long类型应该在后面添加一个L/l
        long data1 = 13245678900L;
//        long data2 = 13245678900l;

        //float 单精度的小数，占四个字节
        //随便写一个小数字面量，会被当成double 类型，如果想让他编程单精度的float在末尾添加f
        float f1 = 3.14f;

        //double 双精度小数 占8个字节
        double d1 = 3.14;

        //布尔值 true false
        boolean b1 = true;
        boolean b2 = false;

        //char 字符 占2个字节
        char c1 = 'a';
        char c2 = '\t';
        System.out.println(6<=10);


    }
}
