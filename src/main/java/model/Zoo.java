package model;

import java.util.ArrayList;

/**
 * Zoo
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Zoo {

   private final String name;
   private final ArrayList<Animal> animals;

   public Zoo(String name) {
      this.name = name;
      animals = new ArrayList<>();
   }

   public String getName() {
      return name;
   }

   public void addAnimal(Animal animal) {
      animals.add(animal);
   }

   public ArrayList<Animal> getAnimals() {
      return animals;
   }

   @Override
   public String toString() {
      return "Zoo [name=" + name + ", animals=" + animals + "]";
   }

   public ArrayList<WaterAnimal> getWaterAnimals() {
      ArrayList<WaterAnimal> waterAnimals = new ArrayList<>();

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
