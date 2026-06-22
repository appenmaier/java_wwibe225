package main;

import java.math.BigDecimal;

/**
 * Demonstrates all primitive data types: integer, char, boolean, and floating point.
 * Also shows the precision difference between {@code float}, {@code double}, and {@code BigDecimal}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D03_PrimitiveDataTypes {

   public static void main(String[] args) {
      /* integer numbers */
      byte byte1 = 67;
      short short1 = 22_743;
      int int1 = 1_000_000_000;
      long long1 = 5_000_000_000L;

      System.out.println("byte1: " + byte1);
      System.out.println("short1: " + short1);
      System.out.println("int1: " + int1);
      System.out.println("long1: " + long1);

      /* characters */
      char char1 = 'A';
      char char2 = 0b1000001;
      char char3 = 0101;
      char char4 = 65;
      char char5 = 0x41;
      char char6 = '\u0041';

      System.out.println("char1: " + char1);
      System.out.println("char2: " + char2);
      System.out.println("char3: " + char3);
      System.out.println("char4: " + char4);
      System.out.println("char5: " + char5);
      System.out.println("char6: " + char6);

      /* boolean truth value */
      boolean boolean1 = true;

      System.out.println("boolean1 : " + boolean1);

      /* floating point numbers */
      float float1 = 0.1F;
      double double1 = 0.1;

      System.out.println("float1: " + float1);
      System.out.println("double1: " + double1);

      BigDecimal bigDecimal1 = new BigDecimal(0.1F);
      BigDecimal bigDecimal2 = new BigDecimal(0.1);

      System.out.println("bigDecimal1: " + bigDecimal1);
      System.out.println("bigDecimal2: " + bigDecimal2);
   }

}
