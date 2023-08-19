package ObserverDesign;

import java.util.HashMap;

public class Driver {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber aman = new Subscriber("aman");
        Subscriber sayan = new Subscriber("sayan");

        channel.subscribe(aman);
        channel.subscribe(sayan);

        channel.notifySubscriber("python in one video");
    }
}
