package sprint4.show;

import sprint4.person.Director;
import sprint4.person.MusicAuthor;

public class MusicalShow extends Show {
    protected MusicAuthor musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, Director director, int durationInHours, MusicAuthor musicAuthor, String librettoText) {
        super(title, director, durationInHours);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;

    }
    public void printMusicAuthor() {
        System.out.println(" Автор музыки: " + musicAuthor.getName() + " " + musicAuthor.getSurname());
    }

    public void printLibretto() {
        System.out.println("Либретто: " + librettoText);
    }
}