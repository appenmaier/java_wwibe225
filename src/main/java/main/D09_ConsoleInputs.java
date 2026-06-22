package main;

import java.util.Scanner;

/**
 * Demonstrates reading different data types from the console using {@link java.util.Scanner}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D09_ConsoleInputs {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* initialize scanner */
      Scanner scanner = new Scanner(System.in);

      /* read and return values */
      System.out.print("Please enter an integer: ");
      int i1 = scanner.nextInt();
      System.out.println("i1: " + i1);

      System.out.print("Please enter a decimal number: ");
      double d1 = scanner.nextDouble();
      System.out.println("d1: " + d1);

      System.out.print("Please enter a boolean value: ");
      boolean b1 = scanner.nextBoolean();
      System.out.println("b1: " + b1);

      System.out.print("Please enter a single character: ");
      char c1 = scanner.next().charAt(0);
      System.out.println("c1: " + c1);

      System.out.print("Please enter a single word: ");
      String s1 = scanner.next();
      System.out.println("s1: " + s1);

      System.out.println("Please enter any number of words: ");
      scanner.nextLine();
      String s2 = scanner.nextLine();
      System.out.println("s2: " + s2);
   }

}
