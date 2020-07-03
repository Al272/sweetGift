package ru.albu;

public class Banana extends Candy {
    private String color;
    Banana(String name, int weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }
    @Override
    public String toString() {
        return "Название - "+getName()+", Вес - "+getWeight()+", цена - "+getPrice()+", уникальный параметр, цвет - "+color+".";
    }
}
