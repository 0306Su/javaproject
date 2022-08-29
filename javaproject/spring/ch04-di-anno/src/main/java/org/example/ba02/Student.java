package org.example.ba02;

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
                '}';
    }
}
