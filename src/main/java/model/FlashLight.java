package model;

/**
 * A battery-powered flashlight whose energy decreases with each use.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class FlashLight extends Light {

   private double energyLevel;

   /** Creates a new fully-charged flashlight. */
   public FlashLight() {
      energyLevel = 1;
   }

   @Override
   public void switchOn() {
      energyLevel -= 0.1;
      isOn = true;
   }

   /** Recharges the flashlight to full energy (1.0). */
   public void recharge() {
      energyLevel = 1;
   }

   /**
    * Returns whether the flashlight is currently emitting light.
    *
    * @return {@code true} if the flashlight is on and has remaining energy
    */
   @Override
   public boolean isShining() {
      return isOn && energyLevel > 0;
   }

   @Override
   public String toString() {
      return "FlashLight [isOn=" + isOn + ", energyLevel=" + energyLevel + "]";
   }

}
