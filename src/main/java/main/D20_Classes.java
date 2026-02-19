package main;

import model.LightBulb;
import model.TableLight;

/**
 * Classes
 *
 * @author Daniel Appenmaier
 * @version 2.0
 *
 */
public class D20_Classes {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      LightBulb redLightBulb = new LightBulb();
      /* version 1: redLightBulb.color = "rot"; */

      LightBulb blueLightBulb = new LightBulb();
      /* version 1: blueLightBulb.color = "blau"; */

      TableLight tableLight = new TableLight();
      System.out.println(tableLight.isShining());
      tableLight.plugIn();
      System.out.println(tableLight.isShining());
      tableLight.switchOn();
      System.out.println(tableLight.isShining());
      tableLight.changeLightBulb(blueLightBulb);
      System.out.println(tableLight.isShining());
      /* version 1: System.out.println(tableLight.lightBulb.color); */
      LightBulb oldLightBulb = tableLight.changeLightBulb(redLightBulb);
      System.out.println(tableLight.isShining());
      /* version 1: System.out.println(tableLight.lightBulb.color); */
      /* version 1: System.out.println(oldLightBulb.color); */

      System.out.println(tableLight);
   }

}
