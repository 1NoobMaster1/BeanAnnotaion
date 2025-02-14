package com.bean.BeanAnnotation.Controller;

import com.bean.BeanAnnotation.Component.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // private final MyBean myBean;

//    @Autowired
//    public MyController(MyBean myBean) {
//        this.myBean = myBean;
//    }

    @Autowired
    private MyBean myBean;

    @GetMapping("/hello")
    public String hello() {
        return myBean.sayHello();
    }

}
