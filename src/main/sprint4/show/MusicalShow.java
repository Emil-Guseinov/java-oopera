package main.sprint4.show;

import main.sprint4.person.Director;
import main.sprint4.person.Person;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, Director director, int durationInHours, Person musicAuthor, String librettoText) {
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