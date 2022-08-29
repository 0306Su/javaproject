package com.itheima.hello;

/**
 * @author admin
 * @Classname Demo03
 * @Version 1.0.0
 * @Date 2022/8/27 17:22
 */
public class Demo03 {
    public static void main(String[] args) {

        //● 变量要先声明在使用
        int age = 10;
        String name = "名字";
        char xb = '男';
        double sg = 12345.784587451d;
        float ye = 12345.784587451f;
        System.out.println("姓名" + name + "\t 年龄" + age + "\t 性别" + xb + "\t身高" + sg + "\t余额" + ye);


        //● 变量声明之后不能存储其他类型格式
        int age1 = 31;
        //age1 =355.5;
        double age3 = 355.5;
        //● 变量的有效范围从定义开始到定义位置最近的{"对应的"}截至，且在同一个范围内部不能定义2个同名的变量
        {
            int age4 = 56;
            System.out.println(age4);
        }
        //System.out.println(age4);

        //● 定义变量的时候可以没有初始值，但是使用的时候必须赋值
        int age5;
//        System.out.println(age5); 变量没有被初始化
    }
}
