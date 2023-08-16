package CommandDesign;

public class TubeLight implements TubeLightFeatures{

    @Override
    public void switchOn() {
        System.out.println("tube light on");
    }

    @Override
    public void switchOff() {
        System.out.println("tube light off");
    }

    @Override
    public void dimColor() {
        System.out.println("dimming the color");
    }
}
