package main;

import java.util.Scanner;

/**
 * Demonstrates four approaches for multi-way branching on a character:
 * if-else-if ladder, classic switch-case, switch expression with {@code yield},
 * and switch expression with arrow syntax.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D14_Cases {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Please enter \"R/r\", \"G/g\" or \"B/b\": ");
      char color = scanner.next().charAt(0);

      // solution with if-else-if ladder
      String colorText;
      if (color == 'r' || color == 'R') {
         colorText = "red";
      } else if (color == 'g' || color == 'G') {
         colorText = "green";
      } else if (color == 'b' || color == 'B') {
         colorText = "blue";
      } else {
         colorText = "";
      }
      System.out.println(colorText);

      // solution with classic switch-case
      switch (color) {
         case 'r':
         case 'R':
            colorText = "red";
            break;
         case 'g':
         case 'G':
            colorText = "green";
            break;
         case 'b':
         case 'B':
            colorText = "blue";
            break;
         default:
            colorText = "";
            break;
      }
      System.out.println(colorText);

      // solution with switch-case expression (verbose form)
      colorText = switch (color) {
         case 'r', 'R': yield "red";
         case 'g', 'G': yield "green";
         case 'b', 'B': yield "blue";
         default:       yield "";
      };
      System.out.println(colorText);

      // solution with switch-case expression (shorthand form)
      colorText = switch (color) {
         case 'r', 'R' -> "red";
         case 'g', 'G' -> "green";
         case 'b', 'B' -> "blue";
         default       -> "";
      };
      System.out.println(colorText);
   }

}
