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

}
