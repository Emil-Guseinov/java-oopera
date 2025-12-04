package sprint4.show;
import sprint4.person.Choreographer;
import sprint4.person.Director;
import sprint4.person.MusicAuthor;

public class Ballet extends MusicalShow {
    protected Choreographer choreographer;

    public Ballet(String title, Director director, int durationInHours, MusicAuthor musicAuthor, String librettoText,Choreographer choreographer) {
        super(title, director, durationInHours, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

}