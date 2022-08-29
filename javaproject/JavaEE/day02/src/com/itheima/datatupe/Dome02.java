package com.itheima.datatupe;

/**
 * @author admin
 * @Classname Dome02
 * @Version 1.0.0
 * @Date 2022/8/28 11:28
 */
public class Dome02 {
    public static void main(String[] args) {

        //目标： 掌握自动类型转换
        /**
         * 类型转换
         * 类型范围小的变量，可以直接赋值给类型范围大的变量
         *
         */
        byte a = 12;
        int b = a;
        System.out.println(b);
        /**
         * 自动类转换的其他形式
         * char类型的变量可以直接赋值给int 类型的变量
         *byte -> short -> int ->long ->float ->double
         * char -> int
         */
        char c1 = 'a';
        int i1 = c1;

        System.out.println("i1 = " + i1);
        int x = 30;
        double y = x;
        System.out.println(y);

        //自动类型转换
        double money = 100;
    }
}
