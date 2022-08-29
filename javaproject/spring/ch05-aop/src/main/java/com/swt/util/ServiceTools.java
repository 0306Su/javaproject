package com.swt.util;

import java.util.Date;

/**
 * @author admin
 */
public class ServiceTools {
    public static void doLong(){
        System.out.println("均为非业务方法发，该方法执行时间："+new Date());
    }
    public static void doTime(){
        //方法的最后，提交事务
        System.out.println("均为非业务方法，方法执行完毕后，提交事务");
    }
}
