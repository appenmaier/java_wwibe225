package model;

/**
 * Light Bulb
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class LightBulb {

   private final String color;

   public LightBulb(String color) {
      this.color = color;
   }

   public String getColor() {
      return color;
   }

   @Override
   public String toString() {
      return "LightBulb [color=" + color + "]";
   }

}
