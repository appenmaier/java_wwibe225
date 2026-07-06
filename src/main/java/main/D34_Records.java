package main;

import model.DragonClass;
import model.DragonLombok;
import model.DragonRecord;
import model.DragonType;

/**
 * Demonstrates three approaches to creating a simple data carrier:
 * a plain class (manual boilerplate), a {@code record} (compact immutable type),
 * and a Lombok-annotated class (generated boilerplate).
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D34_Records {

   public static void main(String[] args) {
      // Approach with normal class
      DragonClass dragon1 = new DragonClass("Fafnir", DragonType.FIRE, 500);
      DragonClass dragon2 = new DragonClass("Fafnir", DragonType.FIRE, 500);

      System.out.println(dragon1.getName());
      System.out.println(dragon1.equals(dragon2));
      System.out.println(dragon1.hashCode());
      System.out.println(dragon2.hashCode());
      dragon2.setAge(501);
      System.out.println(dragon2);

      // Approach with record
      DragonRecord dragon3 = new DragonRecord("Fafnir", DragonType.FIRE, 500);
      DragonRecord dragon4 = new DragonRecord("Fafnir", DragonType.FIRE, 500);

      System.out.println(dragon3.name());
      System.out.println(dragon3.equals(dragon4));
      System.out.println(dragon3.hashCode());
      System.out.println(dragon4.hashCode());
      // dragon4.setAge(501);
      System.out.println(dragon4);

      // Approach with lombok
      DragonLombok dragon5 = new DragonLombok("Fafnir", DragonType.FIRE, 500);
      DragonLombok dragon6 = new DragonLombok("Fafnir", DragonType.FIRE, 500);

      System.out.println(dragon5.getName());
      System.out.println(dragon5.equals(dragon6));
      System.out.println(dragon5.hashCode());
      System.out.println(dragon6.hashCode());
      dragon6.setAge(501);
      System.out.println(dragon6);
   }

}
