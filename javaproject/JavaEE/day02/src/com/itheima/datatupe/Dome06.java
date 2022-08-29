package com.itheima.datatupe;

import java.util.Scanner;

/**
 * @author admin
 * @Classname Dome06
 * @Version 1.0.0
 * @Date 2022/8/28 14:50
 */
public class Dome06 {
    public static void main(String[] args) {
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
