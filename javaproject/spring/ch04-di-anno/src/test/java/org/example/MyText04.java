package org.example;

import org.example.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyText04 {
    @Test
    public void text01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        Student myStudent = (Student) ctx.getBean("myStudent");
        System.out.println("myStudent = " + myStudent);

    }
}
