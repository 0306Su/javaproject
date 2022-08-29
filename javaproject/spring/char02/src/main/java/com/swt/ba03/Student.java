package com.swt.ba03;

/**
 * @author admin
 */
public class Student {
    private String name;
    private int age;
    //声明一个引用类型

    private School school;

    public void setSchool(School school) {this.school = school;}

    public Student() {
        System.out.println("spring会默认调用的无参构造方法对象");
    }

    /**
     *
     * 有参数构造方法
     */
    public Student(String myName, int myAge,School mySchool) {
        System.out.println("===========Student有参数构造方法 =================");
        //属性复制
        this.name = myName;
        this.age = myAge;
        this.school = mySchool;
    }

    public void setEmail(String email) {
        System.out.println("email=" + email);
    }

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
