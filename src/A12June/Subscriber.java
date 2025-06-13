package A12June;

import java.util.ArrayList;

public class Subscriber {
    private static ArrayList<Channel> list = new ArrayList<>();

    public static void addChannel(Channel obj){
        list.add(obj);
    }
    public static void removeChannel(Channel obj){
        list.remove(obj);
    }
    public static void notify(String news)
    {
        for (int i = 0; i< list.size();i++)
        {
            list.get(i).display(news);
        }
    }
}
