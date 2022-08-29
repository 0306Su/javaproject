package com.swt;

import com.swt.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


    /**
     * @Description
     * @Author swt
     * @Date 2022/7/5
     */
    @SuppressWarnings({"ALL"})
    public class MyTest {
        @Test
        public void test01() {
//        主动创建都对象 正转
            SomeService someService = new SomeServiceImpl();
            someService.dosome();
        }

        /***
         * spring 默认创建对象的时间： 在创建spring的容器时，会创建配置文件中所有的对象。
         * spring 创建的默认是无参构造
         */
        @Test
        public void test02() {
            //使用spring 容器创建对象
            //1、 指定spring 配置文件的名称
            String config = "beans.xml";
            //2、创建spring 容器的兑现，ApplicationContext
            //ApplicationContext就表示spring容器，通过容器获取了对象
            //ClassPathXmlApplicationContext :表示从类路径中加载spring的配置文件
            //此刻对象创建了
            ApplicationContext ac = new ClassPathXmlApplicationContext(config);

            //从容器中获取某个对象，你要调用对象的方法
            //getBean（"配置文件中bean的id值"）
            //将容器中的对象转换为自己需要的对象类型
            SomeService service = (SomeService) ac.getBean("someService");

            //使用spring创建好的对象
            service.dosome();
        }

        @Test
        public void test03() {
            String config = "beans.xml";
            ApplicationContext ac = new ClassPathXmlApplicationContext(config);
            //使用spring提供的方法，获取容器中定义的对象数量
            int nums = ac.getBeanDefinitionCount();
            System.out.println("容器中定义打对象数量：" + nums);
            //容器中每个定义的对象的名称
            String[] names = ac.getBeanDefinitionNames();
            for (String name : names) {
                System.out.println(name);
            }


        }

        //获取一个非自定义的类对象
        @Test
        public void test04() {
            String config = "beans.xml";
            ApplicationContext ac = new ClassPathXmlApplicationContext(config);
            //使用getBean();
            Date my = (Date) ac.getBean("mydate");
            System.out.println("非自定义的类对象" + my);
        }

    }
