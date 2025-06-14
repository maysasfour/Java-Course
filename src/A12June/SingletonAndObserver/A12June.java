package A12June.SingletonAndObserver;

public class A12June {
    public static void main(String[] args) {
        Subscriber.addChannel(new TV("Almamlka"));
        Subscriber.addChannel(new Radio("Funn"));
        Subscriber.addChannel(new Newspaper("aldostoor"));
        Subscriber.addChannel(new TV("Roya"));


        Petra petra = Petra.getObj();
        petra.update(" Java Course");

    }
}
