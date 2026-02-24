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

   private String name;
   private ArrayList<Animal> animals;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void initializeAnimals() {
      animals = new ArrayList<>();
   }

   public void addAnimal(Animal animal) {
      animals.add(animal);
   }

   public ArrayList<Animal> getAnimals() {
      return animals;
   }

}
