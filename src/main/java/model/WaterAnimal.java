package model;

import java.time.LocalDate;

/**
 * Water Animal
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class WaterAnimal extends Animal {

   private final boolean isSaltwater;

   public WaterAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate,
         double weightInKg, boolean isSaltwater) {
      super(type, color, isCarnivore, birthdate, weightInKg);
      this.isSaltwater = isSaltwater;
   }

   public boolean isSaltwater() {
      return isSaltwater;
   }

   public void swim() {
      System.out.println("schwimm, schwimm");
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
