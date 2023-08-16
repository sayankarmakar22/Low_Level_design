package StrategyDesign;

public class UPIStrategy implements PaymentStrategy{
    private String upiId;
    private int mpin;

    public UPIStrategy(String upiId, int mpin) {
        this.upiId = upiId;
        this.mpin = mpin;
    }

    @Override
    public void pay(int amount) {
        System.out.println("total amount is : " + amount + "\n" + " amount has been paid via UPI");
    }
}
