package FacadeDesign;

public class Driver {
    public static void main(String[] args) {
        Television television = new Television();
        SoundSystem soundSystem = new SoundSystem();
        RoomLight roomLight = new RoomLight();

        HomeTheatreFacade facade = new HomeTheatreFacade(television,soundSystem,roomLight);
        facade.watchMovie();
        facade.stopWatchMovie();
    }
}
