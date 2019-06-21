package com.southwind.test;

import com.southwind.entity.Student;
import com.southwind.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-depends.xml");
        User user = (User) applicationContext.getBean("user");
        Student student = (Student) applicationContext.getBean("student");
    }
}
