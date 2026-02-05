package main;

import java.util.Scanner;

/**
 * Console Inputs
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D09_ConsoleInputs {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* Scanner initialisieren */
      Scanner scanner = new Scanner(System.in);

      /* Werte auslesen und zurückgeben */
      System.out.print("Bitte eine ganze Zahl eingeben: ");
      int i1 = scanner.nextInt();
      System.out.println("i1: " + i1);

      System.out.print("Bitte eine reelle Zahl eingeben: ");
      double d1 = scanner.nextDouble();
      System.out.println("d1: " + d1);

      System.out.print("Bitte einen boolschen Wahrheitswert eingeben: ");
      boolean b1 = scanner.nextBoolean();
      System.out.println("b1: " + b1);

      System.out.print("Bitte ein einzelnes Zeichen eingeben: ");
      char c1 = scanner.next().charAt(0);
      System.out.println("c1: " + c1);

      System.out.print("Bitte ein einzelnes Wort eingeben: ");
      String s1 = scanner.next();
      System.out.println("s1: " + s1);

      System.out.println("Bitte beliebig viele Wörter eingeben: ");
      scanner.nextLine();
      String s2 = scanner.nextLine();
      System.out.println("s2: " + s2);
   }

}
