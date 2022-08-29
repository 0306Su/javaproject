package com.swt.impl;

import com.swt.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("The service is not available yet");
    }

    @Override
    public void dosome() {
        System.out.println("执行了SomeServiceImpl的doSome()方法");
    }
}
