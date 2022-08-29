package org.swt.ba01;

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
}
