public interface NewsPublisher {
    
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    String notifySubscribers();
}
