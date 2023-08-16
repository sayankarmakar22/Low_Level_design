package CommandDesign;

public class TubeLightDimColor implements Command{
    TubeLight tubeLight;

    public TubeLightDimColor(TubeLight tubeLight) {
        this.tubeLight = tubeLight;
    }
    @Override
    public void execute() {
        tubeLight.dimColor();
    }
}
