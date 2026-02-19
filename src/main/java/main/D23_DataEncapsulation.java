package main;

import model.LightBulb;
import model.TableLight;

/**
 * Data Encapsulation
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D23_DataEncapsulation {

   public static void main(String[] args) {
      LightBulb redLightBulb = new LightBulb();
      redLightBulb.setColor("rot");

      TableLight light1 = new TableLight();
      light1.switchOn();
      light1.plugIn();
      light1.changeLightBulb(redLightBulb);

      System.out.println(light1.isShining());
      System.out.println(light1.getLightBulb().getColor());
   }

}
