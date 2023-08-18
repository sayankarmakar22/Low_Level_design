package TemplateDesign;

public class OnlineOrder extends OrderProcessTemplate{
    @Override
    protected void selectProcess() {
        System.out.println("selecting product and adding to cart");
    }

    @Override
    protected void makePayment() {
        System.out.println("amount has been paid via card/cash/upi");
    }

    @Override
    protected void deliveryProduct() {
        System.out.println("product dispatched");
    }
}
