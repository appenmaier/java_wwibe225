package main;

import java.util.Scanner;

/**
 * Demonstrates while, do-while, for loops, and loop control
 * with {@code break} and {@code continue} in an infinite loop.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D15_Loops {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* while loop (pre-test loop) */
      int i = 1;
      while (i <= 10) {
         System.out.println(i);
         i++;
      }

      System.out.println();

      /* do-while loop (post-test loop) */
      int x = 1;
      do {
         System.out.println(x);
         x++;
      } while (x <= 10);

      System.out.println();

      /* for loop (counting loop) */
      for (int a = 1; a <= 10; a++) {
         System.out.println(a);
      }

      System.out.println();

      /* infinite loop + loop control with break and continue */
      Scanner scanner = new Scanner(System.in);

      while (true) {
         System.out.print("End loop (true or false)?: ");
         boolean answer = scanner.nextBoolean();
         if (answer) {
            break;
         }
         System.out.print("Print current time (true or false)?: ");
         answer = scanner.nextBoolean();
         if (!answer) {
            continue;
         }
         System.out.println(System.currentTimeMillis());
      }
   }

}
