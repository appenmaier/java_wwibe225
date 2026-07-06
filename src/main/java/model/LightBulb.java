package model;

/**
 * Represents a light bulb with a given color.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class LightBulb {

   private final String color;

   /**
    * Creates a new light bulb with the given color.
    *
    * @param color the color of the light bulb
    */
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
