package main;

import java.util.Scanner;

/**
 * Loops
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D15_Loops {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* while-Schleife (kopfgesteuerte Schleifen) */
      int i = 1;
      while (i <= 10) {
         System.out.println(i);
         i++;
      }

      System.out.println();

      /* do-while-Schleife (fußgesteuerte Schleife) */
      int x = 1;
      do {
         System.out.println(x);
         x++;
      } while (x <= 10);

      System.out.println();

      /* for-Schleife (Zählschleife) */
      for (int a = 1; a <= 10; a++) {
         System.out.println(a);
      }

      System.out.println();

      /* Endlosschleife + Schleifensteuerung mit break und continue */
      Scanner scanner = new Scanner(System.in);

      while (true) {
         System.out.print("Schleife beenden (true oder false)?: ");
         boolean answer = scanner.nextBoolean();
         if (answer == true) { // if (answer) {
            break;
         }
         System.out.print("Uhrzeit ausgeben (true oder false)?: ");
         answer = scanner.nextBoolean();
         if (answer == false) {
            continue;
         }
         System.out.println(System.currentTimeMillis());
      }
   }

}
