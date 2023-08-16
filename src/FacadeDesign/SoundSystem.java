package FacadeDesign;

public class SoundSystem implements Features{
    @Override
    public void switchOn() {
        System.out.println("sound system on");
    }

    @Override
    public void switchOff() {
        System.out.println("sound system off");
    }
}
