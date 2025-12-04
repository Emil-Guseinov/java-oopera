package sprint4.show;

import sprint4.person.Director;
import sprint4.person.MusicAuthor;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, Director director, int durationInHours, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, director, durationInHours, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
    public void printChoirSize() {
        System.out.println(" Поющие в хор: " + choirSize);
    }
}
