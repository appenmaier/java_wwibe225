package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Zoo
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Zoo {

   private final String name;
   private final List<Animal> animals;

   public Zoo(String name) {
      this.name = name;
      animals = new ArrayList<>(); // Upcast
   }

   public String getName() {
      return name;
   }

   public void addAnimal(Animal animal) {
      animals.add(animal);
   }

   public List<Animal> getAnimals() {
      return animals;
   }

   @Override
   public String toString() {
      return "Zoo [name=" + name + ", animals=" + animals + "]";
   }

   public List<WaterAnimal> getWaterAnimals() {
      List<WaterAnimal> waterAnimals = new ArrayList<>();

      for (Animal animal : animals) {
         if (animal instanceof WaterAnimal) {
            WaterAnimal waterAnimal = (WaterAnimal) animal; // Downcast
            waterAnimals.add(waterAnimal);
         }

         if (animal instanceof LandAnimal landAnimal) { // Downcast
            System.out.println(landAnimal + " ist kein Wassertier");
         }
      }

      return waterAnimals;
   }

}
