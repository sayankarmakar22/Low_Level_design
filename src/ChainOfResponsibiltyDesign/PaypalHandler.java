package ChainOfResponsibiltyDesign;

public class PaypalHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount <= 1500){
            System.out.println("Paid using paypal account : "+ amount);
        }
        else{
            next.handlePayment(amount);
        }
    }
}
