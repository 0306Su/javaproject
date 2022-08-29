package org.swt.ba02;

//目标类

/**
 * @author admin
 */
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, Integer age) {
        //给doSome方法增加一个功能，在doSome执行之前，输出方法的执行时间
        System.out.println("=========目标方法doSome（）======");
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
}
