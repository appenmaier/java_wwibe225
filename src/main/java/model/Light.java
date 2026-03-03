package model;

/**
 * Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Light {

   protected boolean isOn;

   public void switchOn() {
      isOn = true;
   }

   public final void switchOff() {
      isOn = false;
   }

   public boolean isOn() {
      return isOn;
   }

   public abstract boolean isShining();

   @Override
   public String toString() {
      return "Light [isOn=" + isOn + "]";
   }

}
