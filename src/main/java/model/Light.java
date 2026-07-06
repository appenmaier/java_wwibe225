package model;

/**
 * Abstract base class for all light sources.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Light {

   protected boolean isOn;

   /** Switches the light on. */
   public void switchOn() {
      isOn = true;
   }

   /** Switches the light off. */
   public final void switchOff() {
      isOn = false;
   }

   public boolean isOn() {
      return isOn;
   }

   /**
    * Returns whether the light is actually emitting light.
    *
    * @return {@code true} if the light is shining
    */
   public abstract boolean isShining();

   @Override
   public String toString() {
      return "Light [isOn=" + isOn + "]";
   }

}
