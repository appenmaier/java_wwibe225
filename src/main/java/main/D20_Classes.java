package main;

import model.LightBulb;
import model.TableLight;

/**
 * Classes
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D20_Classes {

   public static void main(String[] args) {
      LightBulb redLightBulb = new LightBulb();
      redLightBulb.color = "rot";

      LightBulb blueLightBulb = new LightBulb();
      blueLightBulb.color = "blau";

      TableLight tableLight = new TableLight();
      System.out.println(tableLight.isShining());
      tableLight.plugIn();
      System.out.println(tableLight.isShining());
      tableLight.switchOn();
      System.out.println(tableLight.isShining());
      tableLight.changeLightBulb(blueLightBulb);
      System.out.println(tableLight.isShining());
      System.out.println(tableLight.lightBulb.color);
      LightBulb oldLightBulb = tableLight.changeLightBulb(redLightBulb);
      System.out.println(tableLight.isShining());
      System.out.println(tableLight.lightBulb.color);
      System.out.println(oldLightBulb.color);

      System.out.println(tableLight);
   }

}
