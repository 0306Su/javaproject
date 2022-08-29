package org.swt.ba03;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Date;

/**
 * @Aspect:是aspectj框架中的注解。 作用：表示当前类的切面类
 * 切面类：是用来给业务方法增加功能的的类，在这个类中有切面的功能代码
 * 位置：在类定义的上面
 */
@Aspect
public class MyAspect {

    /**
     * 环绕通知方法的定义格式
     * 1、public
     * 2、必须有一个返回值，推荐使用Object
     * 3、方法名称自定义
     * 4、方法有参数，固定的参数ProceedingJoinPoint
     *
     */
    /**
     * @Around：环绕通知 属性：value切入点表达式
     * 位置：在方法的上面
     * 特点：
     * 1、他的功能是最强的通知
     * 2、在目标方方法前和后都能增强功能
     * 3、控制目标方法是否被调用
     * 4、修改原来的目标方法的执行结果。影响最后的调用结果
     * <p>
     * 环绕通知等同于jdk的动态代理 InvocationHandler接口
     * <p>
     * 参数：ProceedingJoinPoint等同于Method
     * 作用:执行目标方法
     * 返回值：就是目标方法的执行结果，可以被修改
     * <p>
     * 环绕通知：经常主要做事务，在目标方法之前做事务，执行目标方法，在目标方法之后提交事务
     */

    @Around(value = "execution(* org.swt.ba03.SomeService.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        String name = "";
        Object args[] = pjp.getArgs();
        if (args != null && args.length > 1) {
            name = (String) args[0];
        }

        //实现环绕通知
        Object result = null;
        //1、目标方法调用
        //method.invoke(); Object result =doFirst();
        System.out.println("环绕通知，在目标方法之前输出时间：" + new Date());
        if ("张三".equals(name)) {
            result = pjp.proceed();
        }
        System.out.println("环绕通知，在目标方法之后，提交事务");
        //2、在目标方法的前或者后加入功能


        //3、修改目标方法的执行结果，影响方法最后的调用结果
        if (result != null) {
            result = "修改目标方法的执行结果，影响方法最后的调用结果";
        }
        return result;
        
    }

}
