package com.springcore.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject(){
        super();
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("starting method annotation");
    }

    @PreDestroy
    public void end(){
        System.out.println("ending method annotation");
    }
}
