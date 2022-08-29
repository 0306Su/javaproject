package com.suwenting.excep;

/**
 * @author admin
 * @Classname NotEnoughExpetion
 * @Version 1.0.0
 * @Date 2022/7/14 10:00
 */
//自定义运行异常

public class NotEnoughExpetion  extends RuntimeException {
    public NotEnoughExpetion() {
        super();
    }

    public NotEnoughExpetion(String message) {
        super(message);
    }
}
