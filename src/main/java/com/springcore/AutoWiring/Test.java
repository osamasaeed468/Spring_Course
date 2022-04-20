package com.springcore.AutoWiring;

import com.springcore.collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiringConfig.xml");
        Address address =(Address) context.getBean("address");
        System.out.println(address);
    }
}
