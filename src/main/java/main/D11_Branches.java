package main;

import java.util.Scanner;

/**
 * Demonstrates if/else branches, nested branches, the if-else-if ladder,
 * comparison operators, logical operators, and lazy evaluation.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D11_Branches {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Please enter your age: ");
      int age = scanner.nextInt();

      /* simple branches */
      if (age < 18) {
         System.out.println("You are a minor");
      } else {
         System.out.println("You are an adult");
      }

      /* nested branches */
      // verbose form
      if (age < 12) {
         System.out.println("You are a child");
      } else {
         if (age < 18) {
            System.out.println("You are a teenager");
         } else {
            if (age < 65) {
               System.out.println("You are an adult");
            } else {
               System.out.println("You are a senior");
            }
         }
      }

      // shorthand form (if-else-if ladder)
      if (age < 12) {
         System.out.println("You are a child");
      } else if (age < 18) {
         System.out.println("You are a teenager");
      } else if (age < 65) {
         System.out.println("You are an adult");
      } else {
         System.out.println("You are a senior");
      }

      /* comparison operators: >, >=, <, <=, ==, != */
      /* logical operators: && (logical AND), || (logical OR), ! (logical NOT) */

      /* lazy evaluation (not exam-relevant) */
      System.out.println("Please enter your gender: ");
      char gender = scanner.next().charAt(0);
      if (gender == 'f' || ++age >= 18) {
         System.out.println("Have fun at the party");
      }
      System.out.println(age);
   }

}
