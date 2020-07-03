package ru.albu;

public class Lollipop extends Candy{
    private String form;
    Lollipop(String name, int weight, double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    @Override
    public String toString() {
        return "Название - "+getName()+", Вес - "+getWeight()+", цена - "+getPrice()+", уникальный параметр, форма - "+form+".";
    }

}
