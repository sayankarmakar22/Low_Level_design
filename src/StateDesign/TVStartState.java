package StateDesign;

public class TVStartState implements State{
    @Override
    public void doAction() {
        System.out.println("tv is turned on");
    }
}
