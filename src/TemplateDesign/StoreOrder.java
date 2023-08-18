package TemplateDesign;

public class StoreOrder extends OrderProcessTemplate{
    @Override
    protected void selectProcess() {
        System.out.println("selecting product on store");
    }

    @Override
    protected void makePayment() {
        System.out.println("amount has been paid via card/cash/upi");
    }

    @Override
    protected void deliveryProduct() {
        System.out.println("product delivered to customer");
    }
}
