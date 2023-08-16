package ProxyDesign;

public class ATM implements  Account{
    private BankAccount bankAccount = new BankAccount();
    @Override
    public void withdraw() {
        bankAccount.withdraw();
    }

    @Override
    public void getAccountDetails() {
        bankAccount.getAccountDetails();
    }
}
