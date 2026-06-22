package main;

import model.TableLight;

/**
 * Demonstrates static class members: a static counter shared across all instances
 * and a static constant ({@link Math#PI}).
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D27_StaticElements {

   public static void main(String[] args) {
      int numberOfTableLights = TableLight.getNumberOfTableLights();
      System.out.println(numberOfTableLights);

      TableLight light1 = new TableLight();
      light1.switchOn();
      TableLight light2 = new TableLight();
      light2.plugIn();
      TableLight light3 = new TableLight();
      light3.plugIn();

      numberOfTableLights = TableLight.getNumberOfTableLights();
      System.out.println(numberOfTableLights);

      System.out.println(Math.PI);
   }

}
