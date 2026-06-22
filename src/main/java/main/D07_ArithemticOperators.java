package main;

/**
 * Demonstrates arithmetic operators: basic operations, increment/decrement,
 * pre/post-increment, and division by zero behaviour.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D07_ArithemticOperators {

   public static void main(String[] args) {
      /* basic arithmetic */
      int a = 5, b = 3;

      int c1 = a + b; // addition
      int c2 = a - b; // subtraction
      int c3 = a * b; // multiplication
      int c4 = a / b; // integer division (quotient)
      int c5 = a % b; // integer division (remainder)
      double c6 = (double) a / b; // division
      float c7 = (float) a / b; // division

      System.out.println("c1: " + c1);
      System.out.println("c2: " + c2);
      System.out.println("c3: " + c3);
      System.out.println("c4 and c5: " + c4 + " remainder " + c5);
      System.out.println("c6: " + c6);
      System.out.println("c7: " + c7);

      /* incrementing */
      int c = 0;
      c = c + 1;
      c += 1;
      c++;

      System.out.println("c: " + c);

      /* decrementing */
      c = c - 1;
      c -= 1;
      c--;

      System.out.println("c: " + c);

      /* post-increment vs pre-increment */
      c = 0;
      a = 1;
      c = a++;
      System.out.println("c: " + c);
      System.out.println("a: " + a);

      c = 0;
      a = 1;
      c = ++a;
      System.out.println("c: " + c);
      System.out.println("a: " + a);

      /* division by zero */
      double d1 = 1.0 / 0.0;
      double d2 = 1.0 / -0.0;
      double d3 = 0.0 / 0.0;
      double d4 = 0.0 / -0.0;
      // int i1 = 1 / 0;
      // int i2 = 1 / -0;

      System.out.println("d1: " + d1);
      System.out.println("d2: " + d2);
      System.out.println("d3: " + d3);
      System.out.println("d4: " + d4);
      // System.out.println("i1 : " + i1);
      // System.out.println("i2 : " + i2);
   }

}
