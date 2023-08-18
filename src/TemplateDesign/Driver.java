package TemplateDesign;

public class Driver {
    public static void main(String[] args) {
        StoreOrder storeOrder = new StoreOrder();
        storeOrder.processOrder();
        OnlineOrder onlineOrder = new OnlineOrder();
        onlineOrder.isGiftWrap = true;
        onlineOrder.processOrder();
    }
}
