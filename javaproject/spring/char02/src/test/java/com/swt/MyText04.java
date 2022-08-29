package com.swt;

import com.swt.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;


public class MyText04 {
    @Test
    public void test01() {
        String config = "ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象 alt+enter 强制类型转换
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("Student " + myStudent);


    }
}
