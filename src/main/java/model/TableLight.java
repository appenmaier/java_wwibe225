package model;

/**
 * Table Light
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class TableLight extends Light {

   private boolean isConnected;
   private LightBulb lightBulb;
   private final PlugType plugType;

   private static int numberOfTableLights;

   public TableLight() {
      plugType = PlugType.TYPE_F;
      numberOfTableLights++;
   }

   public TableLight(LightBulb lightBulb) {
      plugType = PlugType.TYPE_F;
      numberOfTableLights++;
      this.lightBulb = lightBulb;
   }

   public void plugIn() {
      isConnected = true;
   }

   public void pullThePlug() {
      isConnected = false;
   }

   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   @Override
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

   public LightBulb getLightBulb() {
      return lightBulb;
   }

   @Override
   public String toString() {
      return "TableLight [isConnected=" + isConnected + ", isOn=" + isOn + ", lightBulb="
            + lightBulb + ", plugType=" + plugType + "]";
   }

   public static int getNumberOfTableLights() {
      return numberOfTableLights;
   }

   public PlugType getPlugType() {
      return plugType;
   }

}
