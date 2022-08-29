package org.example.ba06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component("myStudent")

public class Student {

    @Value(value = "张飞")
    private String name;
    private Integer age;

    /**
     * 引用类型
     *
     * @Resourse：来自jdk中的注解，spring框架提供了对这个注解的功能支持，可以使用引用类型 使用的也是自动注入原理，支持byName，byType 默认维byName
     * 位置：1、在属性定义的上面，无需set方法，推荐使用
     * 2、在set方法的上面
     * @Resource:只使用byName方式，需要增加一个属性 name
     * name的值时bean的id名称
     * @Resource(byName = "myschool")
     */
    //默认byName ：先使用byName自动注入，如果byName赋值失败，在使用byType

    @Resource
    private School school;

    public Student() {
        System.out.println("student无参构造");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("60")
    public void setAge(Integer age) {
        System.out.println("age = " + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
