package observer_news_agency;

public class Bobute implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Oooho kokios naujienos!");
        System.out.println("Reikia skambinti virgai ir perduoti naujienas");
        skambinkVirgai(message);
    }

    private void skambinkVirgai (String message) {
        System.out.println("Alio virga ar girdejai?");
        System.out.println(message);
    }
}
