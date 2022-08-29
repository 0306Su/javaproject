package com.itheima.bit;

import java.util.Scanner;

/**
 * @author admin
 * @Classname Text04
 * @Version 1.0.0
 * @Date 2022/8/28 20:48
 */
public class Text04 {
    public static void main(String[] args) {
//        需求:
//        动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
//        请用程序实现判断两只老虎的体重是否相同。
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入");
        int a = scanner.nextInt();
        System.out.println("输入");
        int b = scanner.nextInt();
        boolean c = a==b ? true:false;
        System.out.println(c);
    }
}
