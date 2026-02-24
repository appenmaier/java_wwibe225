package main;

import java.util.ArrayList;

import model.LightBulb;
import model.TableLight;

/**
 * String toString()
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D26_ToString {

   public static void main(String[] args) {
      ArrayList<TableLight> lights = new ArrayList<>();
      LightBulb redLightBulb = new LightBulb("rot");
      TableLight light1 = new TableLight(redLightBulb);
      TableLight light2 = new TableLight();

      lights.add(light1);
      lights.add(light2);

      System.out.println(redLightBulb);
      System.out.println(light1.toString()); // expliziter Aufruf der toString-Methode
      System.out.println(light2); // impliziter Aufruf der toString-Methode
      System.out.println(lights);
   }

}
