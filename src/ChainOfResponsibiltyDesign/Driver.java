package ChainOfResponsibiltyDesign;

public class Driver {
    public static void main(String[] args) {
        PaymentHandler bank = new BankHandler();
        PaymentHandler card = new CreditCardHandler();
        PaymentHandler paypal = new PaypalHandler();
        bank.setNext(card);
        card.setNext(paypal);

        bank.handlePayment(200);
        bank.handlePayment(1200);
        bank.handlePayment(2000);
        bank.handlePayment(900);
    }
}
