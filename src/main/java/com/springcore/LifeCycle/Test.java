package com.springcore.LifeCycle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleConfig.xml");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        Samosa samosa = (Samosa) context.getBean("samosa");
        System.out.println(samosa);

        //tell container to call destroy method
        context.registerShutdownHook();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        Pepsi pepsi =(Pepsi) context.getBean("pepsi");
        System.out.println(pepsi);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        Subject subject =(Subject) context.getBean("subject");
        System.out.println(subject);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");



    }
}
