package com.itheima.datatupe;

/**
 * @author admin
 * @Classname Text05
 * @Version 1.0.0
 * @Date 2022/8/28 21:39
 */
public class Text05 {
    public static void main(String[] args) {
        int a = 10;
        {
            a = 20;
            System.out.println(a);
        }

// 片段2
        {
            int b = 20;
            System.out.println(b);
        }
        int b;
        b = 30;
        System.out.println(b);
    }
}
