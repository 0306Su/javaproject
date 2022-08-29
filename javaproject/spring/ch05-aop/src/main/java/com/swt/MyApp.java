package com.swt;

import com.swt.handler.MyIncationHandler;
import com.swt.service.SomeService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {

    public static void main(String[] args) {
/*        //调用doSome ，doOther
        SomeService service = new SomeServiceImpl();
        service.doOther();
        System.out.println("==================");
        service.doSome();*/

        //使用jdk的Proxy创建对象
        //创建目标对象
        SomeService service = new SomeServiceImpl();
        //创建InvocationHandler对象
        InvocationHandler handler = new MyIncationHandler(service);
        //使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                service.getClass().getInterfaces(), handler);
        //通过代理执行方法，会调用handler中的invoke
        proxy.doSome();
        System.out.println("============= ");
        proxy.doOther();
    }
}
