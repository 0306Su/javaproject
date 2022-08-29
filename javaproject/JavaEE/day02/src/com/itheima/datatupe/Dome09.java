package com.itheima.datatupe;

/**
 * @author admin
 * @Classname Dome09
 * @Version 1.0.0
 * @Date 2022/8/28 16:43
 */
public class Dome09 {
    public static void main(String[] args) {
        //目标： 掌握 逻辑运算符
        //& | ! ^
        //要求 手机内存在8 GB以上，并且屏幕尺寸在7英寸以上
        int memory = 8;
        int size = 8;
        System.out.println(memory > 8 & size > 7);

        //逻辑或
        //要求手机内存在8GB以上 ，或者屏幕尺寸在7 英寸以上
        System.out.println(memory > 8 | size > 7);
        System.out.println(memory > 8 | size > 8);
        System.out.println(memory > 8 | size > 7);
        System.out.println(memory >= 8 | size >= 7);

        //逻辑非！
        System.out.println(!true);
        System.out.println(!false);

        //逻辑异或^
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println("===================");
        //段落逻辑运算符
        //&& 特点 ：左边是false 右边就不执行
        int x = 10;
        int y = 20;
        System.out.println(x > 15 && ++y > 15);
        System.out.println(y);
        System.out.println("----------");
        System.out.println(x > 15 & ++y > 15);
        System.out.println(y);

        int m = 10;
        int n = 20;
        System.out.println(m < 15 || --n > 15);
        System.out.println(n);
        System.out.println("----------------------");
        System.out.println(m < 15 | --n > 15);
        System.out.println(n);
        System.out.println("******************");
        System.out.println(true || (1 / 0 == 1));
//        System.out.println(true| (1/0==1)); 算数运行异常
        System.out.println(false && (1 / 0 == 1));
//        System.out.println(false&(1/0==1));算数运行异常
        int a = 10;
        if (a > n) {
            System.out.println("**");
        } else {
            System.out.println("ss5");
        }
        System.out.println(a > n ? 5 : 7 < n ? 90 : 80);
     }
}
