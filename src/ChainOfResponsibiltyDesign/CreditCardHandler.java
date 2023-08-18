package ChainOfResponsibiltyDesign;

public class CreditCardHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount <= 1000){
            System.out.println("Paid using credit card : "+ amount);
        }
        else{
            next.handlePayment(amount);
        }
    }
}
