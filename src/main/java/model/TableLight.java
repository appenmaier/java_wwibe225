package model;

/**
 * A table lamp that requires a power connection and a light bulb to shine. Tracks the total number
 * of instances created via a static counter.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public final class TableLight extends Light implements WiredDevice {

   private boolean isConnected;
   private LightBulb lightBulb;
   private final PlugType plugType;

   private static int numberOfTableLights;

   /** Creates a new table lamp with no light bulb and plug type F. */
   public TableLight() {
      plugType = PlugType.TYPE_F;
      numberOfTableLights++;
   }

   /**
    * Creates a new table lamp with the given light bulb and plug type F.
    *
    * @param lightBulb the light bulb to install
    */
   public TableLight(LightBulb lightBulb) {
      plugType = PlugType.TYPE_F;
      numberOfTableLights++;
      this.lightBulb = lightBulb;
   }

   @Override
   public void plugIn() throws AlreadyPluggedInException {
      if (isConnected) {
         throw new AlreadyPluggedInException();
      }

      isConnected = true;
   }

   @Override
   public void pullThePlug() {
      isConnected = false;
   }

   /**
    * Replaces the current light bulb with a new one.
    *
    * @param newLightBulb the replacement light bulb
    * @return the old light bulb that was removed
    */
   public LightBulb changeLightBulb(LightBulb newLightBulb) {
      LightBulb oldLightBulb = lightBulb;
      lightBulb = newLightBulb;
      return oldLightBulb;
   }

   /**
    * Returns whether the lamp is actually emitting light.
    *
    * @return {@code true} if the lamp is connected, switched on, and has a light bulb
    */
   @Override
   public boolean isShining() {
      return isConnected && isOn && lightBulb != null;
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

   /**
    * Returns the total number of {@link TableLight} instances created.
    *
    * @return the number of TableLight instances
    */
   public static int getNumberOfTableLights() {
      return numberOfTableLights;
   }

   public PlugType getPlugType() {
      return plugType;
   }

}
