package model;

/**
 * Table Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLight {

   public boolean isConnected;
   public boolean isOn;
   public LightBulb lightBulb;

   public void plugIn() {
      isConnected = true;
   }

   public void pullThePlug() {
      isConnected = false;
   }

   public void switchOn() {
      isOn = true;
   }

   public void switchOff() {
      isOn = false;
   }

   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   public boolean isShining() {
      if (isConnected == true && isOn == true && lightBulb != null) {
         return true;
      } else {
         return false;
      }
      // return isConnected && isOn && lightBulb != null;
   }

}
