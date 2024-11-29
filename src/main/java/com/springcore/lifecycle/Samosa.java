package com.springcore.lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Samosa() {
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside init method : Hello ! ");
    }

    public void destroy(){
        System.out.println("Inside destroy method : Bye Bye i am going to die... !");
    }
}
