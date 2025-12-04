package sprint4;

import sprint4.person.*;
import sprint4.show.Ballet;
import sprint4.show.Opera;
import sprint4.show.Show;

public class Theatre {
     public static void main(String[] args) {
         Actor actor1 = new Actor("Эллен", "ДеДженерес", Gender.FEMALE,172);
         Actor actor2 = new Actor("Джим", "Гэффиган", Gender.MALE,175);
         Actor actor3 = new Actor("Эмили", "Разерфорд", Gender.FEMALE,168);
         MusicAuthor author = new MusicAuthor("Мартин", "Мулл", Gender.MALE);
         Director director1 = new Director("Клорис", "Личмен", Gender.FEMALE,3);
         Director director2 = new Director("Эндрю","Д.Вейман",Gender.MALE, 2);
         Choreographer choreographer = new Choreographer("Эллен","Стюарт",Gender.FEMALE);

         Show fantasy = new Show ("Фэнтези",director1,120);
         Opera opera = new Opera("Проклятый замок", director2,160, author,"Замок Чудовища.", 20);
         Ballet ballet = new Ballet("Красавица и Чудовище",director1,60,author,"История преображения Чудовища через красоту и любовь Лиоры.",choreographer);

         fantasy.addActor(actor1);
         fantasy.addActor(actor2);

         opera.addActor(actor3);
         opera.addActor(actor1);

         ballet.addActor(actor3);
         ballet.addActor(actor2);


         System.out.println("-----------------------");

         fantasy.printDirector(director1);
         fantasy.printDirector(director2);
         System.out.println("-----------------------");

         fantasy.printActors();
         System.out.println("-----------------------");

         opera.printActors();
         opera.printMusicAuthor();
         opera.printChoirSize();
         System.out.println("-----------------------");

         ballet.printActors();
         ballet.printMusicAuthor();
         System.out.println("-----------------------");

         fantasy.replaceActor("ДеДженерес", actor3);
         fantasy.printActors();
         System.out.println("-----------------------");

         opera.replaceActor("Хаген", actor2);
         System.out.println("-----------------------");

         opera.printLibretto();
         ballet.printLibretto();

    }
}