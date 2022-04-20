package com.springcore.StandAloneCollections;

import com.springcore.AutoWireAnnotation.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("StandAloneCollectionsConfig.xml");
        Person person =(Person) context.getBean("person");
        System.out.println(person);

    }
}
