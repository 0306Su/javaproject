package org.swt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.swt.ba03.SomeService;

public class myTest03 {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ctx.getBean("someService");
        //通过代理的对象方法执行方法 ，实现目标方法执行时，增强了功能
        String str = proxy.doFirst("张三", 20);

        System.out.println("proxy = " + proxy.getClass().getName());
        System.out.println("str = " + str);

    }
}
