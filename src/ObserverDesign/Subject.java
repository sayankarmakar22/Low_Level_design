package ObserverDesign;

interface Subject {
    void subscribe(Observers ob);
    void unsubscribe(Observers ob);
    void notifySubscriber(String title);
}
