package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
//    @Autowired
    private Address address;


    public Address getAddress() {
        return address;
    }
//    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    public Emp(Address address) {
        super();
        this.address = address;
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
