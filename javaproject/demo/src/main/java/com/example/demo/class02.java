package com.example.demo;

import java.util.Scanner;

/**
 * @author admin
 * @Classname class02
 * @Version 1.0.0
 * @Date 2022/7/25 14:10
 */
public class class02 {
    public static void main(String[] args) {
        String pre = "ab";
        String next = "ba";
        int count = 0;
        int[] flag = new int[pre.length()];
        if(pre.length() != next.length()){
            System.out.println("false");
            return ;
        }
        for (int i = 0; i < pre.length(); i++) {
            if (pre.charAt(i) != next.charAt(i) ){
                flag[count++] = i;
            }
        }
        if (count>2||count==1){
            System.out.println("false");
        } else if (count==2) {
            if(pre.charAt(flag[0]) != next.charAt(flag[1])||pre.charAt(flag[1])!=next.charAt(flag[0])){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
