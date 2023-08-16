package FacadeDesign;

public class HomeTheatreFacade {
    private Television television;
    private SoundSystem soundSystem;
    private RoomLight roomLight;

    public HomeTheatreFacade(Television television, SoundSystem soundSystem, RoomLight roomLight) {
        this.television = television;
        this.soundSystem = soundSystem;
        this.roomLight = roomLight;
    }

    public void watchMovie(){
        television.switchOn();
        soundSystem.switchOn();
        roomLight.lightsDim();
    }
    public void stopWatchMovie(){
        television.switchOff();
        soundSystem.switchOff();
        roomLight.lightsBright();
    }
}
