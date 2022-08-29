package com.itheima.datatupe;

/**
 * @author admin
 * @Classname Demo03
 * @Version 1.0.0
 * @Date 2022/8/28 11:52
 */
public class Demo03 {
    public static void main(String[] args) {
        //目标： 掌握表达式中的自动类型转换
        // 表达式的最终类型由表达式中的最高类型决定
        //byte/short/char 是直接转换成int类型参与运算
        byte a = 10;
        short b = 15;
        char c = 'c';
        int d = 18;
        float f = 30;
        double g = 31.1;

        int rse1 = a + b;
        System.out.println("rse1 = " + rse1);
        int rse2 = a + a;
        System.out.println("rse2 = " + rse2);
        int rse3 = c + b;
        System.out.println("rse3 = " + rse3);
        float rse4 = d + f;
        System.out.println("rse4 = " + rse4);
        double rse5 = f + g;
        System.out.println("rse5 = " + rse5);
        double rse6 = 3.15;
        System.out.println("rse6 = " + rse6);
        //如果表达式中出现double 类型，结果一定是double类型
        //如果表达式中没有double ,但是出现了float类型，结果一定是float
        //如果表达式中没有double类型，也没有float类型，那么结果一定是long类型
        //否则都为int类型

        int x = 10;
        long y = 20;
        long res7 = x + y;
        System.out.println("res7 = " + res7);
    }
}
