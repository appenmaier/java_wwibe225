package model;

/**
 * Flash Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class FlashLight {

   private boolean isOn;
   private double energyLevel;

   public FlashLight() {
      energyLevel = 1;
   }

   public void switchOn() {
      energyLevel -= 0.1;
      isOn = true;
   }

   public void switchOff() {
      isOn = false;
   }

   public void recharge() {
      energyLevel = 1;
   }

   public boolean isShining() {
      if (isOn == true && energyLevel > 0) {
         return true;
      } else {
         return false;
      }
      // return isOn && energyLevel > 0;
   }

   @Override
   public String toString() {
      return "FlashLight [isOn=" + isOn + ", energyLevel=" + energyLevel + "]";
   }

}
