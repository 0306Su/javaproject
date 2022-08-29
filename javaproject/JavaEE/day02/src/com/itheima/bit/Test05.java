package com.itheima.bit;

import java.util.Scanner;

/**
 * @author admin
 * @Classname Test05
 * @Version 1.0.0
 * @Date 2022/8/28 20:51
 */
public class Test05 {
    public static void main(String[] args) {
/*        需求:
        一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
        请用程序实现获取这三个和尚的最高身高。*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入");
        int a = scanner.nextInt();
        System.out.println("输入");
        int b = scanner.nextInt();
        System.out.println("输入");
        int c = scanner.nextInt();
        int d = a>b?(a>c?a:c) :(b>c?b:c);
        System.out.println(d);

    }
}
