package A12June.SingletonAndObserver;

public class TV extends Channel {
    public TV(String name) {
        super(name);
    }

    public    void   display(String news){
        System.out.println("Tv"+ news);
    }
}
