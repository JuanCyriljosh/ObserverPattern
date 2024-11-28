public class Subscriber implements NewsObserver {
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public void receiveUpdate(NewsAgency newsAgency) {

        System.out.println("Everyone " + name + "!");
        System.out.println("NEWS UPDATE NOW: " + newsAgency.getLatestNews());
    }
}
