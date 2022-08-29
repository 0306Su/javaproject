package com.itheima.bit;

import java.util.Scanner;

/**
 * @author admin
 * @Classname txet1
 * @Version 1.0.0
 * @Date 2022/8/28 21:05
 */
public class txet1 {
    public static void main(String[] args) {
//        请编写程序，
//        将某位学员的个人信息输出到屏幕上。
//        信息包括姓名（字符串常量）、性别（字符常量）、
//        年龄（整型常量）、身高（单位米，小数常量）、婚否（布尔常量）。
//        输出格式如下：
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入性别：");
        char axg = scanner.next().charAt(0);
        System.out.println("请输年龄：");
        int nianling = scanner.nextInt();
        System.out.println("请输入身高：");
        double hight = scanner.nextDouble();
        System.out.println("请输入婚否：");
        boolean hf = scanner.hasNextBoolean();
        System.out.println(name+"\n"+axg+"\n"+nianling+"\n"+hight+"\n"+hf);
    }
}
