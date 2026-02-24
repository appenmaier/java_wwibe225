package model;

/**
 * Table Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLight {

   private boolean isConnected;
   private boolean isOn;
   private LightBulb lightBulb;

   private static int numberOfTableLights;

   public TableLight() {
      numberOfTableLights++;
   }

   public TableLight(LightBulb lightBulb) {
      numberOfTableLights++;
      this.lightBulb = lightBulb;
   }

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

   public boolean isConnected() {
      return isConnected;
   }

   public boolean isOn() {
      return isOn;
   }

   public LightBulb getLightBulb() {
      return lightBulb;
   }

   @Override
   public String toString() {
      return "TableLight [isConnected=" + isConnected + ", isOn=" + isOn + ", lightBulb="
            + lightBulb + "]";
   }

   public static int getNumberOfTableLights() {
      return numberOfTableLights;
   }

}
