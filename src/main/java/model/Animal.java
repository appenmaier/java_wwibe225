package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Animal
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Animal {

   private final String type;
   protected double weightInKg;
   private final Color color;
   private final boolean isCarnivore;
   private final LocalDate birthdate;

   public Animal(String type, Color color, boolean isCarnivore, LocalDate birthdate,
         double weightInKg) {
      this.type = type;
      this.color = color;
      this.isCarnivore = isCarnivore;
      this.birthdate = birthdate;
      this.weightInKg = weightInKg;
   }

   public abstract void eat();

   public void move() {
      weightInKg *= 0.98;
   }

   public final String getType() {
      return type;
   }

   public final double getWeightInKg() {
      return weightInKg;
   }

   public final Color getColor() {
      return color;
   }

   public final boolean isCarnivore() {
      return isCarnivore;
   }

   public final LocalDate getBirthdate() {
      return birthdate;
   }

   @Override
   public String toString() {
      return "Animal [type=" + type + ", color=" + color + ", weightInKg=" + weightInKg
            + ", isCarnivore=" + isCarnivore + ", birthdate=" + birthdate + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(birthdate, color, isCarnivore, type, weightInKg);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Animal other = (Animal) obj;
      return Objects.equals(birthdate, other.birthdate) && color == other.color
            && isCarnivore == other.isCarnivore && Objects.equals(type, other.type)
            && Double.doubleToLongBits(weightInKg) == Double.doubleToLongBits(other.weightInKg);
   }

}
