package com.fucker.app;

import com.fucker.pojo.User;
import com.fucker.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = ap.getBean(UserServiceImpl.class);
        List<User> all = userService.findAll();
        System.out.println(all);
    }
}
