package main;

import java.util.Scanner;

/**
 * Conditional Branches
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D13_ConditionalBranches {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Bitte Dein Alter eingeben: ");
      int age = scanner.nextInt();

      String ageText;
      if (age < 18) {
         ageText = "minderjährig";
      } else {
         ageText = "volljährig";
      }
      System.out.println("Du bist " + ageText);

      ageText = (age < 18) ? "minderjährig" : "volljährig";
      System.out.println("Du bist " + ageText);
   }

}
