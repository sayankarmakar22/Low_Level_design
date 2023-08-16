package CommandDesign;

public class TubelightOnCommand implements Command{
    TubeLight tubeLight;

    public TubelightOnCommand(TubeLight tubeLight) {
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        tubeLight.switchOn();
    }
}
