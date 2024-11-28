import java.util.*;

public class Main {
    public static void main(String[] args) {

        Subscriber sub1 = new Subscriber();
        sub1.setName("Juan");

        Subscriber sub2 = new Subscriber();
        sub2.setName("DelaCruz");

        Subscriber sub3 = new Subscriber();
        sub3.setName("Rod");

        List<Subscriber> subscribers = new ArrayList<>();

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setSubscribers(subscribers);
        newsAgency.addSubscriber(sub1);
        newsAgency.addSubscriber(sub2);
        newsAgency.addSubscriber(sub3);

        newsAgency.publishNews("WEST PHILIPPINE SEA - CHINESE SHIP SPOTTED!!!");

        System.out.println("\nLatest Update:");
        System.out.println(newsAgency.notifySubscribers());

        newsAgency.removeSubscriber(sub3);

        Subscriber pogi = new Subscriber();
        pogi.setName("Roberto");
        newsAgency.addSubscriber(pogi);

        System.out.println("\nFresh News Update:");
        System.out.println(newsAgency.notifySubscribers());

        pogi.receiveUpdate(newsAgency);
    }
}
