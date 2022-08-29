package com.itheima.bit;

import java.util.Scanner;

/**
 * @author admin
 * @Classname Dome04
 * @Version 1.0.0
 * @Date 2022/8/28 20:23
 */
public class Dome04 {
    public static void main(String[] args) {
      /*  某外卖商家的菜品单价如下:
        1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
        2.优惠方式:
        总金额大于100元,总金额打9折,其它无折扣
        3.需求:
        小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?*/
        int yxrs = 24;
        int hsm = 8 ;
        int mf = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要买几份鱼香肉丝：");
        int mai = scanner.nextInt();


        System.out.println("请输入您要买几份花生米：");
        int hm = scanner.nextInt();

        System.out.println("请输入您要买几份米饭：");
        int m = scanner.nextInt();
        double zj = (mai*yxrs)+ (hm*hsm)+(mf*m);
        if(zj > 100){
            zj*=0.9;
            System.out.println(zj);
        }else{
            System.out.println(zj);
        }

    }
}
