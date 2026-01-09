package observer_news_agency;

public class ObserverDemoMain {

    public static void main(String[] args) {

        NewsAgency delfi = new NewsAgency();

        Observer smartTV = new SmartTV();
        Observer bobuteDana = new Bobute();

        delfi.addObserver(smartTV);
        delfi.addObserver(bobuteDana);

        delfi.setNews("Rytoj Vilnije bus -30 laipsniu salcio!");
        System.out.println();
        delfi.setNews("Sabonis imete 50 tasku.");
    }
}
