package ChainOfResponsibiltyDesign;

public class BankHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount > 1500){
            System.out.println("sorry you cant pay this amount at a time !");
        }
        else if(amount <= 500){
            System.out.println("Paid using bank account : "+ amount);
        }
        else{
            next.handlePayment(amount);
        }
    }
}
