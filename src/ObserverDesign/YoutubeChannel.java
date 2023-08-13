package ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    List<Observers> ytSubscribersList = new ArrayList<>();
    @Override
    public void subscribe(Observers ob) {
        ytSubscribersList.add(ob);
    }

    @Override
    public void unsubscribe(Observers ob) {
        ytSubscribersList.remove(ob);
    }

    @Override
    public void notifySubscriber(String title) {
        for(Observers ob : this.ytSubscribersList){
            ob.notified(title);
        }
    }
}
