package main;

import model.AlreadyPluggedInException;
import model.TableLight;

/**
 * Demonstrates the difference between primitive value copying and object reference sharing: two
 * reference variables pointing to the same object.
 *
 * @author Daniel Appenmaier
 * @version 3.0
 *
 */
public class D21_Objects {

   public static void main(String[] args) throws AlreadyPluggedInException {
      int i = 0;
      TableLight light1 = null;

      i = 5;
      light1 = new TableLight();
      /* version 2: LightBulb redLightBulb = new LightBulb(); */
      /* version 1: redLightBulb.color = "red"; */
      /* version 2: light1.changeLightBulb(redLightBulb); */

      int x = i;
      TableLight light2 = light1;

      i = 7;
      light2.plugIn();
      light1.switchOn();

      System.out.println("i: " + i);
      System.out.println("x: " + x);
      System.out.println("light1: " + light1);
      System.out.println("light2: " + light2);
      System.out.println(light1.isShining());
      System.out.println(light2.isShining());
   }

}
