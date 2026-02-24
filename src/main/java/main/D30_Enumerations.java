package main;

import java.time.LocalDate;

import model.PlugType;
import model.TableLight;
import model.Weekday;

/**
 * Enumerations
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D30_Enumerations {

   public static void main(String[] args) {
      PlugType typeF = PlugType.TYPE_F;
      PlugType typeI = PlugType.TYPE_I;

      TableLight light1 = new TableLight();

      System.out.println(typeF);
      System.out.println(typeI);
      System.out.println(light1);

      System.out.println(Weekday.THURSDAY);
      System.out.println(LocalDate.now().getMonth());
      System.out.println(PlugType.valueOf("TYPE_F"));
   }

}
