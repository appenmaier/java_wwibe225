package model;

import java.time.LocalDate;

/**
 * Animal
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Animal {

   private String type;
   private double weightInKg;
   private String color;
   private boolean isCarnivore;
   private LocalDate birthdate;

   public void setType(String type) {
      this.type = type;
   }

   public void setWeightInKg(double weightInKg) {
      this.weightInKg = weightInKg;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public void setCarnivore(boolean isCarnivore) {
      this.isCarnivore = isCarnivore;
   }

   public void setBirthdate(LocalDate birthdate) {
      this.birthdate = birthdate;
   }

   public void eat() {
      weightInKg *= 1.05;
   }

   public void move() {
      weightInKg *= 0.98;
   }

   public String getType() {
      return type;
   }

   public double getWeightInKg() {
      return weightInKg;
   }

   public String getColor() {
      return color;
   }

   public boolean isCarnivore() {
      return isCarnivore;
   }

   public LocalDate getBirthdate() {
      return birthdate;
   }

}
