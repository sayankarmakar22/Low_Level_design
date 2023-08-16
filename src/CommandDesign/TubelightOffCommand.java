package CommandDesign;

public class TubelightOffCommand implements Command{
    TubeLight tubeLight;

    public TubelightOffCommand(TubeLight tubeLight) {
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        tubeLight.switchOff();
    }
}
