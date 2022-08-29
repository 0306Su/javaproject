package com.suwenting;

import com.suwenting.Service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 * @Classname MyTest
 * @Version 1.0.0
 * @Date 2022/7/14 10:22
 */
public class MyTest {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        //从从容获取service
        BuyGoodsService service = (BuyGoodsService) ctx.getBean("buyService");
        System.out.println("service是代理:"+service.getClass().getName());
        //调用方法
        service.buy(1001,10);
    }
}
