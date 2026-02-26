package main;

import java.util.ArrayList;

import model.FlashLight;
import model.LightBulb;
import model.TableLight;

/**
 * Inheritance
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D31_Inheritance {

   public static void main(String[] args) {
      /* Objekterzeugungen */
      TableLight tableLight1 = new TableLight();
      LightBulb redLightBulb = new LightBulb("rot");
      TableLight tableLight2 = new TableLight(redLightBulb);

      FlashLight flashLight1 = new FlashLight();
      FlashLight flashLight2 = new FlashLight();

      /* Ansatz ohne Vererbung */
      ArrayList<TableLight> tableLights = new ArrayList<>();
      tableLights.add(tableLight1);
      tableLights.add(tableLight2);

      for (TableLight light : tableLights) {
         light.switchOn();
         System.out.println(light.isShining());
      }

      ArrayList<FlashLight> flashLight = new ArrayList<>();
      flashLight.add(flashLight1);
      flashLight.add(flashLight2);

      for (FlashLight light : flashLight) {
         light.switchOn();
         System.out.println(light.isShining());
      }
   }

}
