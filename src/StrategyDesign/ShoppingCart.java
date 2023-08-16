package StrategyDesign;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        System.out.println(item.getName() + "item added");
        items.add(item);
    }
    public void removeItem(Item item){
        System.out.println(item.getName() + "item remove");
        items.remove(item);
    }
    public int calculatePrice(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
            int amount = calculatePrice();
            paymentStrategy.pay(amount);
    }
}