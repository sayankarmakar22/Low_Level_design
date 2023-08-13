package ObserverDesign;

public class Subscriber implements Observers{
    String name;
    public Subscriber(String name){
        this.name = name;
    }
    String title;
    @Override
    public void notified(String title) {
        this.title = title;
        System.out.println(name + " new video uploaded : " + title);
    }
}
