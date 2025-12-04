package main.sprint4.show;
import main.sprint4.person.Director;
import main.sprint4.person.Person;

public class Ballet extends MusicalShow {
    protected Person choreographer;

    public Ballet(String title, Director director, int durationInHours, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, director, durationInHours, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

}