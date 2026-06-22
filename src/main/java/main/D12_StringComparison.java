package main;

import java.util.Scanner;

/**
 * Demonstrates why {@code ==} must not be used for String comparison
 * and how to use {@link String#equals} instead.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D12_StringComparison {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Please enter the string \"true\": ");
      String input = scanner.next();

      if (input == "true") {
         System.out.println("Well done");
      } else {
         System.out.println("Unfortunately wrong");
      }

      if (input.equals("true")) {
         System.out.println("Correct");
      } else {
         System.out.println("Wrong");
      }
   }

}
