动态代理：可以在程序的执行过程中，创建代理
通过代理对象执行方法，给目标的方法增加额外的功能（功能增强）
jdk动态代理实现步骤：
1、创建目标类，SomeServiceImpl目标类，给他的doSome，doOther增加 输出时间，事务
2、创建InvocationHandler接口的实现类，这个类实现目标给方法增加功能
3、使用jdk中的Proxy，创建代理对象，创建对象实例。