package com.springcore.AutoWireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    //Qualifier annotation is used to use specific obj
    @Qualifier("address1")
    private Address address;


    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }


    public Emp(Address address) {
        this.address = address;
        System.out.println("Inside Constructor");
    }

    public Emp() {
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
