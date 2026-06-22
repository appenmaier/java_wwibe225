package main;

import model.TableLight;

/**
 * Demonstrates data encapsulation: accessing object state only through
 * getter and setter methods rather than public fields.
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D23_DataEncapsulation {

   public static void main(String[] args) {
      /* version 1: LightBulb redLightBulb = new LightBulb(); */
      /* version 1: redLightBulb.setColor("red"); */

      TableLight light1 = new TableLight();
      light1.switchOn();
      light1.plugIn();
      /* version 1: light1.changeLightBulb(redLightBulb); */

      System.out.println(light1.isShining());
      System.out.println(light1.getLightBulb().getColor());
   }

}
