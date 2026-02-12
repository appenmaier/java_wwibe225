package main;

import java.util.Scanner;

/**
 * Cases
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D14_Cases {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Bitte gib \"R/r\", \"G/g\" oder \"B/b\" ein: ");
      char color = scanner.next().charAt(0);

      // Lösung mit if-elseif-Leiter
      String colorText;
      if (color == 'r' || color == 'R') {
         colorText = "rot";
      } else if (color == 'g' || color == 'G') {
         colorText = "grün";
      } else if (color == 'b' || color == 'B') {
         colorText = "blau";
      } else {
         colorText = "";
      }
      System.out.println(colorText);

      // Lösung mit dem klassischen switch-case
      switch (color) {
         case 'r':
         case 'R':
            colorText = "rot";
            break;
         case 'g':
         case 'G':
            colorText = "grün";
            break;
         case 'b':
         case 'B':
            colorText = "blau";
            break;
         default:
            colorText = "";
            break;
      }
      System.out.println(colorText);

      // Lösung mit dem switch-case-Ausdruck (ausführliche Schreibweise)
      switch (color) {
         case 'r', 'R':
            colorText = "rot";
         case 'g', 'G':
            colorText = "grün";
         case 'b', 'B':
            colorText = "blau";
         default:
            colorText = "";
      }
      System.out.println(colorText);

      // Lösung mit dem switch-case-Ausdruck (Kurzschreibweise)
      colorText = switch (color) {
         case 'r', 'R' -> "rot";
         case 'g', 'G' -> "grün";
         case 'b', 'B' -> "blau";
         default       -> "";
      };
      System.out.println(colorText);
   }

}
