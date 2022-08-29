package com.itheima.datatupe;

/**
 * @author admin
 * @Classname text08
 * @Version 1.0.0
 * @Date 2022/8/28 21:50
 */
public class text08 {
    public static void main(String[] args) {
        /*我们输出HelloWorld时
        输出语句为：System.out.println("HelloWorld");
        其实，这个输出语句就是输出了一个字符串，这个字符串也可以由两个或者多个字符串组成。
        例如：System.out.println("Hello" + "World");
        这里，两个字符串会先拼接为一个，再输出，结果与上面一致。再比如：int age = 20;
        System.out.println("我的年龄是" + age);
        上面输出语句中，将int类型的变量与字符串连接在一起，组成一个新的字符串，
        程序的输出结果是：我的年龄是20而且，还可以多个数据与字符串连接，
        例如：int height = 180;System.out.println("我的年龄是" + age + "，我的身高是" + height);
        这个语句中，两个字符串与两个变量会拼成一个字符串输出，输出结果为：我的年龄是20，我的身高是180*/

        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }
}
