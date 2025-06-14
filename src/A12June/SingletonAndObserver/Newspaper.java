package A12June.SingletonAndObserver;

public class Newspaper extends Channel {
    public Newspaper(String name) {
        super(name);
    }

    @Override
    public void display(String news) {
        System.out.println("Newspaper" + news);
    }

}