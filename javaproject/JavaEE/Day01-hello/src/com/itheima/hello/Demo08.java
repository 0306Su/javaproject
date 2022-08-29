package com.itheima.hello;

/**
 * @author admin
 * @Classname Demo08
 * @Version 1.0.0
 * @Date 2022/8/27 18:50
 */
public class Demo08 {
    public static void main(String[] args) {
      /*  请根据下列描述，选择合适的变量存储各种的数据，并模拟张三收李四和王五发来的红包的过程。

        1)   张三自己的钱包里有5.1元钱。

        2）李四发出了8.5元红包给张三

        3）王五发出了20.0元红包给张三

        4）请使用变量来运算出，张三 收到李四的红包后有多少钱并输出，张三收到王五的红包后有多少钱并输出。
        张三目前的余额是是：
        5.1
        张三接收李四的红包后余额是：
        13.6
        张三接收王五的红包后余额是：
        33.6
        */
        double a = 5.1;
        System.out.println("张三的余额是：\n" + a);
        a = a + 8.5;
        System.out.println("张三收到李四红包的余额是：\n" + a);
        a = a + 20;
        System.out.println("张三收到王五红包的余额是：\n" + a);

    }
}
