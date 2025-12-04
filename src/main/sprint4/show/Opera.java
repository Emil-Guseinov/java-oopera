package main.sprint4.show;

import main.sprint4.person.Director;
import main.sprint4.person.Person;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, Director director, int durationInHours, Person musicAuthor, String librettoText, int choirSize) {
        super(title, director, durationInHours, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
    public void printChoirSize() {
        System.out.println(" Поющие в хор: " + choirSize);
    }
}
