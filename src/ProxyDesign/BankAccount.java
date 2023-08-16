package ProxyDesign;

public class BankAccount implements Account{
    @Override
    public void withdraw() {
        System.out.println("withdraw is under processing...");
    }

    @Override
    public void getAccountDetails() {
        System.out.println("fetching account details...");
    }
}
