package org.example.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("myStudent")

public class Student {
    /**
     * @value：简单类型属性赋值
     *      属性:value 是String类型的，表示简单的属性值
     *      位置：1、在属性定义上面，无需set方法，推荐使用
     *           2、在set方法上面
     */
    @Value(value = "张飞")
    private String name;
    private Integer age;

    /**
     * 引用类型
     * @Autowired: spring框架提供的注解，实现引用类型的赋值
     * spring中通过注解给引用类型赋值，使用的是自动注入原理，支持byName，byType
     * @Autowwired：默认使用的是byType自动注入。
     *
     * 位置：1）在属性定义的上面，无需set方法，推荐使用
     *      2）在set方法的上面
     *  属性：required ,是一个Boolean 类型的，默认true
     *  required=true:表示引用类型赋值失败，程序报错，并终止执行
     *  required=false：表示引用类型复制失败，程序正常执行，引用类型是null
     *
     * 如果使用byName方式，需要做的是：
     * 1、在属性上面加入@Autowwired
     * 2、在属性上面加入@Qualifier(value="bean的id”)；表示使用指定名称的bean完成赋值操作
     */
    //byName自动注入
            
    @Autowired(required = false)
    @Qualifier("mySchool")
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
