package com.swt;

import com.swt.dao.StudentDao;
import com.swt.domian.Student;
import com.swt.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class myText {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        String names[] = ctx.getBeanDefinitionNames();
        for (String na : names) {
            System.out.println("容器中的对象名称：" + na + "|" + ctx.getBean(na));
        }

    }

    @Test
    public void testDaoInsert() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentDao dao = (StudentDao) ctx.getBean("studentDao");
        Student student = new Student();
        student.setId(1004);
        student.setName("张飞");
        student.setEmail("1297860770@qq.com");
        student.setAge(56);
        int nums = dao.inserStudent(student);
        System.out.println("nums = " + nums);
    }

    @Test
    public void testServiceInsert() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService Ser = (StudentService) ctx.getBean("studentService");
        Student student = new Student();
        student.setId(1007);
        student.setName("张飞");
        student.setEmail("1297860770@qq.com");
        student.setAge(56);
        int nums = Ser.addStudent(student);
        //spring和mybatis整合在一起使用，事务提交自动提交的。无需要执行SqlSensation.commit()
        System.out.println("nums = " + nums);
    }

    @Test
    public void testServiceSelect() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        StudentService Ser = (StudentService) ctx.getBean("studentService");

        List<Student> students = Ser.queryStudents();
        for (Student student : students) {
            System.out.println("student = " + student);
        }


    }
}
