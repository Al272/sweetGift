package ru.albu;

public class Cookie extends Candy {
    String taste;
    Cookie(String name, int weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }
    @Override
    public String toString() {
        return "Название - "+getName()+", Вес - "+getWeight()+", цена - "+getPrice()+", уникальный параметр, вкус - "+taste+".";
    }
}
