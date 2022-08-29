package com.itheima.hello;

/**
 * @author admin
 * @Classname Demo06
 * @Version 1.0.0
 * @Date 2022/8/27 18:39
 */
public class Demo06 {
    public static void main(String[] args) {
        /*
        字符串字面量:用双引号括起来的内容。  		   -->要求--->		请在控制台输出字符串 	"HelloWorld"
        整数字面量:不带小数的数字。	      		  -->要求--->	   	   请在控制台输出整数数字	666
        小数字面量:带小数的数字。		  		   -->要求--->		请在控制台输出小数数字	 -5.21
        字符字面量:用单引号括起来的内容。    		-->要求--->	     请在控制台输出字符		'我'
        布尔字面量:布尔值,表示真假。只有两个值：	  -->要求--->        请在控制台输出布尔字面量	false
         */
        System.out.println("\"HelloWorld\"");
        String a = "HelloWorld";
        System.out.println("\"" + a + "\"");

        System.out.println(666);
        System.out.println(-5.21);
        System.out.println("\'我\'");
        System.out.println(false);
    }
}
