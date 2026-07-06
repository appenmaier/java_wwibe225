package model;

import java.time.LocalDate;

/**
 * Represents a water-dwelling animal.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class WaterAnimal extends Animal {

   private final boolean isSaltwater;

   /**
    * Creates a new water animal.
    *
    * @param type        the species name
    * @param color       the color of the animal
    * @param isCarnivore {@code true} if the animal is a carnivore
    * @param birthdate   the animal's date of birth
    * @param weightInKg  the animal's weight in kilograms
    * @param isSaltwater {@code true} if the animal lives in saltwater
    */
   public WaterAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate,
         double weightInKg, boolean isSaltwater) {
      super(type, color, isCarnivore, birthdate, weightInKg);
      this.isSaltwater = isSaltwater;
   }

   public boolean isSaltwater() {
      return isSaltwater;
   }

   /** Makes the animal swim, printing a swimming sound. */
   public void swim() {
      System.out.println("swim, swim");
   }

   @Override
   public void eat() {
      weightInKg *= 1.02;
   }

   @Override
   public void move() {
      super.move();
      swim();
   }

   @Override
   public String toString() {
      return "WaterAnimal [type=" + getType() + ", color=" + getColor() + ", weightInKg="
            + getWeightInKg() + ", isCarnivore=" + isCarnivore() + ", birthdate=" + getBirthdate()
            + ", isSaltwater=" + isSaltwater + "]";
   }

}
