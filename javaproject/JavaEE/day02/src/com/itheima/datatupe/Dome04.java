package com.itheima.datatupe;

/**
 * @author admin
 * @Classname Dome04
 * @Version 1.0.0
 * @Date 2022/8/28 12:11
 */
public class Dome04 {
    public static void main(String[] args) {
        //目标学会强制类型转换
        //类型范围大的属性值患者变量，不能直接赋值给类型范围小的变量，会报错
        //强制类型转换
        //可以强行将类型范围大的变量，数据赋值给类型范围小的值
        //格式 数据类型 变量名2 = （数据类型） 变量1 、数据1
        int a = 10;
        //byte b = a;
        byte b = (byte) a;
        System.out.println("b = " + b);

        //强制转换会造成数据丢失
        int i =1500;
        byte j = (byte) i;
        System.out.println("j = " + j);
        //小数强转为整数，规则直接丢掉小数部分，保留整数部分
        double d = 3.14;
        int  e = (int) d;
        System.out.println("e = " + e);
    }
}
