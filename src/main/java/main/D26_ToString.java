package main;

import java.util.ArrayList;

import model.LightBulb;
import model.TableLight;

/**
 * Demonstrates the {@code toString()} method: explicit calls, implicit calls
 * (via {@code println}), and how it works for objects inside an {@link java.util.ArrayList}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D26_ToString {

   public static void main(String[] args) {
      ArrayList<TableLight> lights = new ArrayList<>();
      LightBulb redLightBulb = new LightBulb("red");
      TableLight light1 = new TableLight(redLightBulb);
      TableLight light2 = new TableLight();

      lights.add(light1);
      lights.add(light2);

      System.out.println(redLightBulb);
      System.out.println(light1.toString()); // explicit call to toString method
      System.out.println(light2); // implicit call to toString method
      System.out.println(lights);
   }

}
