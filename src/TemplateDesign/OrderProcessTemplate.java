package TemplateDesign;

public abstract class OrderProcessTemplate {
    boolean isGiftWrap;
    protected abstract void selectProcess();
    protected abstract void makePayment();
    protected abstract void deliveryProduct();

    private final void packProduct(){
        if(isGiftWrap){
            System.out.println("gift wrapping product");
        }
        else{
            System.out.println("simple packing");
        }
    }
    public final void processOrder(){
        selectProcess();
        makePayment();
        packProduct();
        deliveryProduct();
    }
}
