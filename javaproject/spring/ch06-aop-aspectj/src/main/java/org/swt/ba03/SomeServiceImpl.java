package org.swt.ba03;

//目标类

import org.swt.ba02.Student;

/**
 * @author admin
 */
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, Integer age) {
        try {
            //给doSome方法增加一个功能，在doSome执行之前，输出方法的执行时间
            System.out.println("=========目标方法doSome（）======");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("=========目标方法doSome（）======");
        return "abcd";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        Student student = new Student();
        student.setName("李四");
        student.setAge(35);
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("业务方法doFirst()");
        return "null";
    }
}
