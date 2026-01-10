package fasade;

public class HomeCinemaFacade {

    private TV tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeCinemaFacade(TV tv, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movieName) {
        System.out.println("Welcome to this fantastic home cinema!!!");
        tv.turnOnTV();
        soundSystem.turnOnSystem();
        dvdPlayer.playMovie(movieName);
    }

    public void endMovie () {
        System.out.println("Shutting down home cinema!");
        dvdPlayer.stopMovie();
        soundSystem.turnOffSystem();
        tv.turnOffTV();
        System.out.println("See you next time! Good night!");
    }
}
