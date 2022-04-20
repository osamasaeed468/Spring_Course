package com.springcore.constructorInjection;

public class Certificate {
    public String name;

    public Certificate(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
