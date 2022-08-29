package com.itheima.datatupe;

/**
 * @author admin
 * @Classname Dome07
 * @Version 1.0.0
 * @Date 2022/8/28 15:05
 */
public class Dome07 {
    public static void main(String[] args) {
        //自增自减运算符
        //++ -- 只能操作变量不能操作字面量
        int count = 100;
        count++;
        System.out.println(count);
        //++ -- 即可以放在变量前 也可以放在变量后
        ++count;
        System.out.println(count);

        System.out.println("===========");
        int num = 10;
        num--;
        --num;
        System.out.println(num);
        System.out.println("=====++ -- 不是单独使用放在变量前后有明显区别====");
        //++ -- 放在变量前 ，先运算后赋值
        int a = 10;
        int res = ++a;
        System.out.println(a);
        System.out.println(res);

        //++--放在变量后 ，是先运算后赋值
        int b = 10;
        int ser = b++;
        System.out.println(b);
        System.out.println(ser);
        int c = 10;
        int d = 5;
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3);
        System.out.println(c);
        System.out.println(d);


    }
}
