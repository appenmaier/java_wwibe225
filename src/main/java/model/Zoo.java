package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a zoo that holds a collection of animals.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Zoo {

   private final String name;
   private final List<Animal> animals;

   /**
    * Creates a new zoo with the given name.
    *
    * @param name the name of the zoo
    */
   public Zoo(String name) {
      this.name = name;
      animals = new ArrayList<>(); // Upcast
   }

   /** @return the name of the zoo */
   public String getName() {
      return name;
   }

   /**
    * Adds an animal to the zoo.
    *
    * @param animal the animal to add
    */
   public void addAnimal(Animal animal) {
      animals.add(animal);
   }

   /** @return the list of all animals in the zoo */
   public List<Animal> getAnimals() {
      return animals;
   }

   @Override
   public String toString() {
      return "Zoo [name=" + name + ", animals=" + animals + "]";
   }

   /**
    * Returns all water animals in the zoo, and prints a message for each land animal.
    *
    * @return list of water animals
    */
   public List<WaterAnimal> getWaterAnimals() {
      List<WaterAnimal> waterAnimals = new ArrayList<>();

      for (Animal animal : animals) {
         if (animal instanceof WaterAnimal) {
            WaterAnimal waterAnimal = (WaterAnimal) animal; // Downcast
            waterAnimals.add(waterAnimal);
         } else if (animal instanceof LandAnimal landAnimal) { // Downcast
            System.out.println(landAnimal + " is not a water animal");
         }
      }

      return waterAnimals;
   }

}
