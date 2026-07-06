package model;

import java.time.LocalDate;

/**
 * Represents a land-dwelling animal with a fixed number of legs.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class LandAnimal extends Animal {

   private final int numberOfLegs;

   /**
    * Creates a new land animal.
    *
    * @param type         the species name
    * @param color        the color of the animal
    * @param isCarnivore  {@code true} if the animal is a carnivore
    * @param birthdate    the animal's date of birth
    * @param weightInKg   the animal's weight in kilograms
    * @param numberOfLegs the number of legs
    */
   public LandAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate,
         double weightInKg, int numberOfLegs) {
      super(type, color, isCarnivore, birthdate, weightInKg);
      this.numberOfLegs = numberOfLegs;
   }

   public int getNumberOfLegs() {
      return numberOfLegs;
   }

   /** Makes the animal run, printing a running sound. */
   public void run() {
      System.out.println("run, run");
   }

   @Override
   public void eat() {
      weightInKg *= 1.05;
   }

   @Override
   public void move() {
      super.move();
      run();
   }

   @Override
   public String toString() {
      return "LandAnimal [type=" + getType() + ", color=" + getColor() + ", weightInKg="
            + getWeightInKg() + ", isCarnivore=" + isCarnivore() + ", birthdate=" + getBirthdate()
            + ", numberOfLegs=" + numberOfLegs + "]";
   }

}
