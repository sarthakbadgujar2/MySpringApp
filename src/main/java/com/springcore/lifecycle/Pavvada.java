package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pavvada implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pavvada() {
        super();
    }

    @Override
    public String toString() {
        return "Pavvada{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Works same as initMethod of lifecycle - Taking Pavvada");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Works same as destroyMethod of lifecycle - Pavvada khatam");
    }
}
