package FacadeDesign;

public class Television implements Features{
    @Override
    public void switchOn() {
        System.out.println("tv on");
    }

    @Override
    public void switchOff() {
        System.out.println("tv off");
    }
}
