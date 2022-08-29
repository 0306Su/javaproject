package com.example.demo;

import java.util.Scanner;

/**
 * @author admin
 * @Classname class01
 * @Version 1.0.0
 * @Date 2022/7/25 13:35
 */
public class class01 {
    public static void main(String[] args) {
        int line = 5;
        int i , j , k ;
        for (i = 1; i <=line; i++) {
            for (j=1;j <=line-i;j++){
                System.out.print("-");
            }
            for (k = 1; k <= 2*i-1 ; k++) {
                System.out.print("+");
            }
            for ( j = 1; j <=line-i ; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

    }
}
