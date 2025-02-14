package com.bean.BeanAnnotation.Component;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public String sayHello() {
        return "Hello from MyBean Class!";
    }
}
