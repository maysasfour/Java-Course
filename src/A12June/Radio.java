package A12June;

public class Radio extends Channel {
    public Radio(String name) {
        super(name);
    }

    public void display(String news) {
        System.out.println("Radio" + news);
    }
}