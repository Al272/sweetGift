package ru.albu;

public abstract class Candy {
    private String name;
    private double weight;
    private double price;
    protected Candy(String name, int weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    protected String getName(){
        return name;
    }
    protected double getWeight(){
        return weight;
    }
    protected double getPrice(){
        return price;
    }

}
