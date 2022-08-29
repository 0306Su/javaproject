package com.itheima.hello;

import javax.annotation.processing.SupportedAnnotationTypes;

/**
 * @author admin
 * @Classname Deom02
 * @Version 1.0.0
 * @Date 2022/8/27 16:47
 */
public class Demo02 {
    public static void main(String[] args) {

        //一致
        System.out.println("整数" + 20);
        //一致
        System.out.println("小数" + 2.5);
        //''单引号中的内容不可为空
        System.out.println("字符" + ' ' + 'A');
        //双引号
        System.out.println("字符串" + "字符串");
        //true 与false  布尔值
        System.out.println("boolean" + false+true);
        System.out.print("\t制表符\t制表符\t制表符+\n换行符号");
        //空值不能直接打印
        System.out.println("null");
    }
}
