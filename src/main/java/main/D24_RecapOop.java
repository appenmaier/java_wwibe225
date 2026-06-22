package main;

import java.time.LocalDate;
import java.util.List;

import model.Animal;
import model.Color;
import model.LandAnimal;
import model.WaterAnimal;
import model.Zoo;

/**
 * Recap of OOP concepts: upcasting, dynamic polymorphism, and working with
 * an inheritance hierarchy ({@link model.Animal}, {@link model.LandAnimal},
 * {@link model.WaterAnimal}) through a {@link model.Zoo}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D24_RecapOop {

   public static void main(String[] args) {
      Zoo zoo = new Zoo("Ravensburger Tierpark");

      Animal animal1 = new LandAnimal("Horse", Color.BLACK, false, LocalDate.now(), 100, 4); // Upcast
      Animal animal2 =
            new LandAnimal("Tiger", Color.ORANGE, true, LocalDate.of(2020, 8, 16), 250, 4); // Upcast
      Animal animal3 = new WaterAnimal("Clownfish",
            Color.ORANGE,
            false,
            LocalDate.of(2018, 12, 3),
            0.2,
            true); // Upcast

      zoo.addAnimal(animal1);
      zoo.addAnimal(animal2);
      zoo.addAnimal(animal3);

      animal3.eat();
      animal2.move(); // dynamic polymorphism
      animal2.move(); // dynamic polymorphism
      animal3.move(); // dynamic polymorphism

      List<Animal> animals = zoo.getAnimals();
      for (Animal animal : animals) {
         System.out.println(animal.toString()); // dynamic polymorphism
      }

      System.out.println(zoo);

      System.out.println();

      List<WaterAnimal> waterAnimals = zoo.getWaterAnimals();
      System.out.println(waterAnimals);
   }

}
