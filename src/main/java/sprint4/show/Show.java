package sprint4.show;

import sprint4.person.Actor;
import sprint4.person.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected Director director;
    protected int durationInHours;
    protected ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, Director director, int durationInHours) {

        this.title = title;
        this.director = director;
        this.durationInHours = durationInHours;
    }

    public void printDirector(Director director) {
        System.out.println(director);
    }

    public void addActor(Actor actor) {
        if (actor == null) return;
        if (listOfActors.contains(actor)) {
            System.out.println("Актер уже добавлен");
            return;
        }
        listOfActors.add(actor);
    }

    public void printActors() {
        System.out.println("Список актеров " + title + ":");

        if (listOfActors.isEmpty()) {
            System.out.println("  (нет актёров)");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println(" " + actor);
        }

    }

    public void replaceActor(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр заменён: " + surnameToReplace + " → " + newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surnameToReplace + " не найден.");
    }

}