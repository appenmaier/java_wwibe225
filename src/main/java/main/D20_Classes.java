package main;

import model.TableLight;

/**
 * Classes
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class D20_Classes {

   public static void main(String[] args) {
      /* version 2: LightBulb redLightBulb = new LightBulb(); */
      /* version 1: redLightBulb.color = "rot"; */

      /* version 2: LightBulb blueLightBulb = new LightBulb(); */
      /* version 1: blueLightBulb.color = "blau"; */

      TableLight tableLight = new TableLight();
      System.out.println(tableLight.isShining());
      tableLight.plugIn();
      System.out.println(tableLight.isShining());
      tableLight.switchOn();
      System.out.println(tableLight.isShining());
      /* version 2: tableLight.changeLightBulb(blueLightBulb); */
      System.out.println(tableLight.isShining());
      /* version 1: System.out.println(tableLight.lightBulb.color); */
      /* version 2: LightBulb oldLightBulb = tableLight.changeLightBulb(redLightBulb); */
      System.out.println(tableLight.isShining());
      /* version 1: System.out.println(tableLight.lightBulb.color); */
      /* version 1: System.out.println(oldLightBulb.color); */

      System.out.println(tableLight);
   }

}
