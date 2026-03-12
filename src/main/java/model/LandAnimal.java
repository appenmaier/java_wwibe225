package model;

import java.time.LocalDate;

/**
 * Land Animal
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class LandAnimal extends Animal {

   private final int numberOfLegs;

   public LandAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate,
         double weightInKg, int numberOfLegs) {
      super(type, color, isCarnivore, birthdate, weightInKg);
      this.numberOfLegs = numberOfLegs;
   }

   public int getNumberOfLegs() {
      return numberOfLegs;
   }

   public void run() {
      System.out.println("renn, renn");
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
