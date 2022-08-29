package com.swt.handler;

import com.swt.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author admin
 */
public class MyIncationHandler implements InvocationHandler {

    //目标的对象
    private Object target;

    public MyIncationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象执行方法时，会调用执行这个invoke()

        String methoode = method.getName();
        Object res = null;
        if ("doSome".equals(methoode)) {
            ServiceTools.doLong();//目标方法之前，输出时间
            //执行目标类的方法，通过Method类实现
            //SomeServiceImpl.doOther().doSome()等于下列
            res = method.invoke(target, args);
            ServiceTools.doTime();//在目标方法执行之后提交事务
        } else {
            res = method.invoke(target, args);
        }


        //目标的执行结果
        return res;
    }
}
