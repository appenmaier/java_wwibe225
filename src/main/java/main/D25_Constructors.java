package main;

import model.LightBulb;
import model.TableLight;

/**
 * Constructors
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D25_Constructors {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      LightBulb redLightBulb = new LightBulb("rot");
      // redLightBulb.setColor("rot");

      TableLight light1 = new TableLight();
      TableLight light2 = new TableLight(redLightBulb);
   }

}
