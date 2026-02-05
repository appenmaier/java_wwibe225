package main;

/**
 * Type Casting
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D05_TypeCasting {

   public static void main(String[] args) {
      /* Erweiternde Typumwandlung (Type Promotion) */
      byte b1 = 65;
      short s1 = b1;
      int i1 = s1;
      long l1 = i1;
      float f1 = l1;
      double d1 = f1;

      System.out.println("b1: " + b1);
      System.out.println("s1: " + s1);
      System.out.println("i1: " + i1);
      System.out.println("l1: " + l1);
      System.out.println("f1: " + f1);
      System.out.println("d1: " + d1);

      /* Einschränkende Typumwandlung (Type Demotion) */
      double d2 = 1.9;
      float f2 = (float) d2;
      long l2 = (long) f2;
      int i2 = (int) l2;
      short s2 = (short) i2;
      byte b2 = (byte) s2;

      System.out.println("b2: " + b2);
      System.out.println("s2: " + s2);
      System.out.println("i2: " + i2);
      System.out.println("l2: " + l2);
      System.out.println("f2: " + f2);
      System.out.println("d2: " + d2);

      /* Typumwandlung für char <-> int */
      int i3 = 'A';
      char c3 = 65;

      System.out.println("i3: " + i3);
      System.out.println("c3: " + c3);
   }

}
