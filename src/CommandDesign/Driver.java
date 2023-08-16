package CommandDesign;

public class Driver {
    public static void main(String[] args) {
        TubeLight light = new TubeLight();
        TubelightOnCommand tubelightOnCommand = new TubelightOnCommand(light);
        RemoteController remoteController = new RemoteController(tubelightOnCommand);
        remoteController.pressButton();

        TubelightOffCommand tubelightOffCommand = new TubelightOffCommand(light);
        remoteController.setCommand(tubelightOffCommand);
        remoteController.pressButton();

        TubeLightDimColor tubeLightDimColor = new TubeLightDimColor(light);
        remoteController.setCommand(tubeLightDimColor);
        remoteController.pressButton();

    }
}
