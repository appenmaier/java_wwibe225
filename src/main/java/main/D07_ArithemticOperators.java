package main;

/**
 * Arithmetic Operators
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D07_ArithemticOperators {

   public static void main(String[] args) {
      /* Grundrechenarten */
      int a = 5, b = 3;

      int c1 = a + b; // Addition
      int c2 = a - b; // Subtraktion
      int c3 = a * b; // Multiplikation
      int c4 = a / b; // Ganzzahlige Division (Quotient)
      int c5 = a % b; // Ganzzahlige Division (Divisionsrest)
      double c6 = (double) a / b; // Division
      float c7 = (float) a / b; // Division

      System.out.println("c1: " + c1);
      System.out.println("c2: " + c2);
      System.out.println("c3: " + c3);
      System.out.println("c4 und c5: " + c4 + " Rest " + c5);
      System.out.println("c6: " + c6);
      System.out.println("c7: " + c7);

      /* Inkrementieren */
      int c = 0;
      c = c + 1;
      c += 1;
      c++;

      System.out.println("c: " + c);

      /* Dekrementieren */
      c = c - 1;
      c -= 1;
      c--;

      System.out.println("c: " + c);

      /* Postinkrement vs Preinkrement */
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

      /* Teilen durch Null */
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
