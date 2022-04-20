package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        System.out.println("true");
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
        Employee employee1 =(Employee) context.getBean("employee1");
        System.out.println(employee1);

        // phone list ---> class ---> name
        System.out.println(employee1.getPhones().getClass().getName());

    }
}
