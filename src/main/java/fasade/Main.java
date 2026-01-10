package fasade;

/**
 * Facade Pattern is a structural design pattern.
 * Jis suteikia supaprastinta prieiga prie compleksiniu sistemos vietu
 * pvz.start stop mygtukas masinoje, google ivedimas narsykleje
 * musu pvz namu kino sistema
 */
public class Main {

    public static void main(String[] args) {

        HomeCinemaFacade myCinema = new HomeCinemaFacade(new TV(), new SoundSystem(), new DVDPlayer());

        myCinema.watchMovie("Pietinia Kronikas");
    }
}
