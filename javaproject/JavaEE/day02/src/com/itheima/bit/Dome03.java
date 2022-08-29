package com.itheima.bit;

import java.util.Scanner;

/**
 * @author admin
 * @Classname Dome03
 * @Version 1.0.0
 * @Date 2022/8/28 20:22
 */
public class Dome03 {
    public static void main(String[] args) {
       /* 需求:
        定义一个int类型的变量,初始化值为1234,求这个数的个位,十位,百位,千位分别是多少?

        运行效果:
        1234的个位是4,十位是3,百位是2,千位是1*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字:");
        int age = scanner.nextInt();
        //个位 对10取余
        int ge = age % 10;
        //十位 先 除以十 在对10取余数
        int shi = age / 10 % 10;
        //百位 除以100
        int bai = age / 100;
        System.out.println("个位" + ge + "十位" + shi + "百位" + bai);
    }
}
