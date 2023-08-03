package com.workintech.abstraction;

public class Coke extends ProductForSale {

    private String name;

    public Coke(String type, int price, String description, String name) {
        super(type, price, description);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Name: " + getName());
    }
}
