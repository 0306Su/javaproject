package com.swt;


import com.swt.ba02.School;
import com.swt.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyText02 {
    @Test
    public void test01() {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取Student对象 alt+enter 强制类型转换
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("Student " + myStudent);

        Date myData = (Date) ac.getBean("myData");
        System.out.println("myData = " + myData);
    }
    @Test
    public void test02() {
        Student student = new Student();
        student.setAge(20);
        student.setName("Student");
        student.setEmail("李四qq.com");
        School school = new School();
        school.setAddress("北京");
        school.setName("北京大学");
        student.setSchool(school);
        System.out.println(student);
    }
    @Test
    public void test03() {
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println("Student " + myStudent);

    }
}
