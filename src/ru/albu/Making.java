package ru.albu;

public interface Making {

    public void add(Candy candy);
    public void delete(int index);

    public void giftFullInfo();
    public void giftInfo();
    public void giftWeight();
    public void giftPrice();

    public void reduceWeight(double weight);
    public void reducePrice(double price);
}
