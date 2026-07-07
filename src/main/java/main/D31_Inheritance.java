package main;

import java.util.ArrayList;

import model.AlreadyPluggedInException;
import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.TableLight;

/**
 * Demonstrates inheritance: upcast to a common base type ({@link model.Light}), dynamic
 * polymorphism, instanceof checks, downcast, and the difference between working with and without a
 * shared supertype.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D31_Inheritance {

   public static void main(String[] args) throws AlreadyPluggedInException {
      /* object creation */
      TableLight tableLight1 = new TableLight();
      LightBulb redLightBulb = new LightBulb("red");
      TableLight tableLight2 = new TableLight(redLightBulb);

      FlashLight flashLight1 = new FlashLight();
      FlashLight flashLight2 = new FlashLight();

      /* approach without inheritance */
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

      System.out.println();

      /* approach with inheritance */
      ArrayList<Light> lights = new ArrayList<>();

      lights.add(flashLight1); // Upcast
      lights.add(tableLight1); // Upcast
      lights.add(tableLight2); // Upcast
      lights.add(flashLight2); // Upcast

      for (Light light : lights) {
         light.switchOn(); // Dynamische Polymorphie

         /* until Java 16 */
         if (light instanceof TableLight) {
            TableLight tableLight = (TableLight) light; // Downcast
            tableLight.plugIn();
         }

         /* since Java 16 */
         if (light instanceof TableLight tableLight) { // Downcast
            tableLight.pullThePlug();
         }

         System.out.println(light.isShining()); // static polymorphism (println) + dynamic
                                                // polymorphism (isShining)
         System.out.println(light.toString()); // static polymorphism (println) + dynamic
                                               // polymorphism (toString)
      }
   }

}
