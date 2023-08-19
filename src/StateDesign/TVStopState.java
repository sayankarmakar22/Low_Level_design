package StateDesign;

public class TVStopState implements State{
    @Override
    public void doAction() {
        System.out.println("tv is turned off");
    }
}
