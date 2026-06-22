package main;

import java.util.Scanner;

/**
 * Demonstrates the conditional (ternary) operator {@code ? :} as a
 * concise alternative to an if/else branch.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D13_ConditionalBranches {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Please enter your age: ");
      int age = scanner.nextInt();

      String ageText;
      if (age < 18) {
         ageText = "a minor";
      } else {
         ageText = "an adult";
      }
      System.out.println("You are " + ageText);

      ageText = (age < 18) ? "a minor" : "an adult";
      System.out.println("You are " + ageText);
   }

}
