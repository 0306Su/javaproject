package com.itheima.datatupe;

/**
 * @author admin
 * @Classname Dome08
 * @Version 1.0.0
 * @Date 2022/8/28 15:51
 */
public class Dome08 {
    public static void main(String[] args) {
        //目标： 掌握赋值运算符
        //1、基本赋值运算符 就是一个=
        //2、扩展赋值运算符 ： += 、-=、 /= 、 *= 、%=
        int a = 10;
        a += 5;
        //相当于a = a+5；
        System.out.println(a);

        byte b = 10;
        //b= b+ 5;
        byte c = 5;
        //b=b+c;

        b += c;
        //相当于b = (byte)(b+c)
        System.out.println(b);
    }
}
