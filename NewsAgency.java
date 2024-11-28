import java.util.*;

public class NewsAgency implements NewsPublisher {

    private String latestNews;
    private List<Subscriber> subscribers;

    public String getLatestNews() {
        return latestNews;
    }

    public void publishNews(String news) {
        this.latestNews = news;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {

        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " has subscribed!");
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {

        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " has unsubscribed.");
    }

    @Override
    public String notifySubscribers() {

        StringBuilder notif = new StringBuilder();
        for (Subscriber subscriber : subscribers) {
            
            notif.append("Attention Everyone ").append(subscriber.getName()).append("!\n");
            notif.append("BREAKING NEWS FOR TODAY: ").append(latestNews).append("\n\n");
        }
        return notif.toString();
    }
}
