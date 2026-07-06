package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Abstract base class representing an animal in the zoo.
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

   /**
    * Creates a new animal with the given properties.
    *
    * @param type        the species name of the animal
    * @param color       the color of the animal
    * @param isCarnivore {@code true} if the animal is a carnivore
    * @param birthdate   the animal's date of birth
    * @param weightInKg  the animal's weight in kilograms
    */
   public Animal(String type, Color color, boolean isCarnivore, LocalDate birthdate,
         double weightInKg) {
      this.type = type;
      this.color = color;
      this.isCarnivore = isCarnivore;
      this.birthdate = birthdate;
      this.weightInKg = weightInKg;
   }

   /** Feeds the animal, increasing its weight. */
   public abstract void eat();

   /** Moves the animal, decreasing its weight by 2%. */
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
