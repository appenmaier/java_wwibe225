package main;

import model.Book;
import model.SantaClaus;
import model.Toy;

public class X02_ExamTask04 {

   public static void main(String[] args) {
      SantaClaus santa = new SantaClaus();

      santa.addPresent(new Toy("Elektrische Eisenbahn", 199));
      santa.addPresent(new Book("Es", "Stephen King"));

      santa.wrapAllPresents();

      System.out.println("Anzahl Spielzeuge: " + santa.getNumberOfToys());
   }

}
