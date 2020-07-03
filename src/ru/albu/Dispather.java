package ru.albu;

public class Dispather {
    public static void main(String[] args) {
        Making newGift = new Gift();
        newGift.add(new Banana("банан мини", 50, 87.4, "желтый"));
        newGift.add(new Cookie("печенье сормовское", 200, 35.40,"вареная сгущенка"));
        newGift.add(new Banana("банан красный", 200, 178.99,"красный"));
        newGift.add(new Lollipop("петушок", 25, 8.20,"птица"));
        newGift.add(new Lollipop("дюшес", 40, 22.4,"овал"));
        newGift.add(new Cookie("печенье молочное", 1000, 543.90,"сливочный"));
        newGift.add(new Banana("банан обычный", 2000, 111.47,"светло-желтый"));
        newGift.add(new Lollipop("барбарис", 500, 99.88,"овал"));
        newGift.giftInfo();
        newGift.giftWeight();
        newGift.giftPrice();
        newGift.delete(1);
        newGift.delete(4);
        newGift.add(new Banana("банан зеленый", 500, 511.47,"зеленый"));
        newGift.add(new Lollipop("раковые шейки", 900, 123.88,"продолговатая"));
        newGift.giftInfo();
        newGift.giftWeight();
        newGift.giftPrice();

        System.out.println();
        newGift.giftFullInfo();
        System.out.println();

        newGift.reduceWeight(4000);
        newGift.giftWeight();
        newGift.giftPrice();

        newGift.reducePrice(800);
        newGift.giftWeight();
        newGift.giftPrice();
    }
}
