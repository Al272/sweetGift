package ru.albu;

import java.util.*;

public class Gift implements Making{

    private List<Candy> gift = new ArrayList<>();
    private double giftWeight;
    private double giftPrice;


    public void add(Candy candy){
        gift.add(candy);
    }


    public void delete(int index){
        gift.remove(index);
    }

    public void giftInfo(){
        System.out.print("Этот подарок содержит: ");
            for(int i=0; i<gift.size()-1; i++)
                    System.out.print(gift.get(i).getName()+", ");
            System.out.println(gift.get(gift.size()-1).getName()+".");
    }

    @Override
    public void giftWeight() {
        giftWeight=0;
        for(Candy c : this.gift)
            giftWeight += c.getWeight();
        String result = String.format("%.2f", giftWeight);
        System.out.println("Этот подарок весит - "+result+" грамм.");
    }
    @Override
    public void giftPrice() {
        giftPrice=0;
        for(Candy c : gift)
            giftPrice += c.getPrice();
        String result = String.format("%.2f", giftPrice);
        System.out.println("Этот подарок стоит - "+result+" рублей.");
    }
    public void giftFullInfo(){
        for(Candy c : gift)
            System.out.println(c.toString());
    }

    public static Comparator<Candy> weightComparator = new Comparator<Candy>() {
        @Override
        public int compare(Candy o1, Candy o2) {
            return (int)(o1.getWeight() - o2.getWeight());
        }
    };
    public static Comparator<Candy> priceComparator = new Comparator<Candy>() {
        @Override
        public int compare(Candy o1, Candy o2) {
            return (int)(o1.getPrice() - o2.getPrice());
        }
    };
    public void reduceWeight(double weight){
        Collections.sort(gift, weightComparator);
        System.out.println("Вес подарка должен быть менее чем "+weight);
        while (weight<=giftWeight){
            giftWeight-=gift.get(0).getWeight();
            gift.remove(0);
        }
    }
    public void reducePrice(double price){
        Collections.sort(gift, priceComparator);
        System.out.println("Цена подарка должна быть менее чем "+price);
        while (price<=giftPrice){
            giftPrice-=gift.get(0).getPrice();
            gift.remove(0);
        }
    }
}
