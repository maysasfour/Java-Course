package A12June.SingletonAndObserver;

public abstract class Channel {
    // add subscribers
    // arrays of channels
    private String name;

    public Channel(String name) {
        this.name = name;
    }
    public    abstract void   display(String news);

}
// name
// display method abstract
//