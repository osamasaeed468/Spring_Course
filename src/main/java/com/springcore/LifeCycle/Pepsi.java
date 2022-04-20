package com.springcore.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//InitializingBean, DisposableBean is an Interface
//implements InitializingBean used to call the afterPropertiesSet() method
//implements DisposableBean used to call destroy() method
public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi [price=" + price + "]";
    }
    public Pepsi(){
        super();
    }

    //this method will do init and set the properties
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("taking pepsi: init");
    }
    // Used to destroy
    @Override
    public void destroy() throws Exception {
        System.out.println("Going to put bottle back to shop : destroy");
    }
}
