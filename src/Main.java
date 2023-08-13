import ObserverDesign.Subscriber;
import ObserverDesign.YoutubeChannel;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber sayan = new Subscriber("sayan");
        Subscriber ayan = new Subscriber("ayan");
        Subscriber raman = new Subscriber("raman");
        channel.subscribe(sayan);
        channel.subscribe(ayan);
        channel.subscribe(raman);
        channel.notifySubscriber("python in one video");
        channel.unsubscribe(ayan);
        channel.notifySubscriber("java in one video");
    }
}