package com.springcore.LifeCycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price: ");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public Samosa() {
        super();
    }

    public void init(){
        System.out.println("Inside init method samosa");
    }
    public void destroy(){
        System.out.println("Inside destroy method samosa");
    }

}
