package CommandDesign;

public class RemoteController {
    Command command;

    public RemoteController(Command command) {
        this.command = command;
    }
    void setCommand(Command command){
        this.command = command;
    }
    void pressButton(){
        command.execute();
    }
}
