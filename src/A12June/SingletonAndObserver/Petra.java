package A12June.SingletonAndObserver;

public class Petra {



    // getObj
    // news
    private String news;
    // private constructor
    private Petra()
    {

    }
    // obj/instance
    private static Petra obj = new Petra();

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public static Petra getObj() {
        return obj;
    }
public void update(String news){
        this.news=news;
    Subscriber.notify(news);
}

//    private static Petra instance;
//
//    public static Petra getInstance(String news) {
//        if (instance == null) {
//            instance = new Petra(news);
//        }
//        return instance;
//    }
}
