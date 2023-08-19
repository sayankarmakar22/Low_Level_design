package StateDesign;

public class Driver {
    public static void main(String[] args) {
        TVContext tv = new TVContext();
        State tvOn = new TVStartState();
        State tvOff = new TVStopState();
        tv.setTvState(tvOn);
        tv.doAction();
        tv.setTvState(tvOff);
        tv.doAction();

    }
}
