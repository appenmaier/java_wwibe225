package main;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Animal;
import model.Color;
import model.Zoo;

/**
 * Recap OOP
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D24_RecapOop {

   public static void main(String[] args) {
      Zoo zoo = new Zoo("Ravensburger Tierpark");

      Animal animal1 = new Animal("Pferd", Color.BLACK, false, LocalDate.now(), 100);
      Animal animal2 = new Animal("Tiger", Color.ORANGE, true, LocalDate.of(2020, 8, 16), 250);
      Animal animal3 = new Animal("Schimpanse", Color.BROWN, true, LocalDate.of(2018, 12, 3), 40);

      zoo.addAnimal(animal1);
      zoo.addAnimal(animal2);
      zoo.addAnimal(animal3);

      animal3.eat();
      animal2.move();
      animal2.move();

      ArrayList<Animal> animals = zoo.getAnimals();
      for (Animal animal : animals) {
         System.out.println(animal);
      }

      System.out.println(zoo);
   }

}
