package StrategyDesign;

public class Driver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("chocolate",100);
        Item item2 = new Item("laptop",35000);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay(new UPIStrategy("kar@hdfcbank",1234));
    }
}
