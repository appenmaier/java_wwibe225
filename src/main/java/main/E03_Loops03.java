package main;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercise: a number-guessing game. The program picks a random number between
 * 1 and 100; the user guesses until correct, with hints after each wrong attempt.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E03_Loops03 {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      int randomNumber, tip, attempts = 0;
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();

      randomNumber = random.nextInt(1, 101);
      System.out.println(randomNumber);

      while (true) {
         attempts++;

         System.out.print("Please enter your guess: ");
         tip = scanner.nextInt();

         if (randomNumber > tip) {
            System.out.println("Wrong, the number is greater");
         } else if (randomNumber < tip) {
            System.out.println("Wrong, the number is smaller");
         } else {
            System.out.println("Correct! You needed " + attempts + " attempts");
            break;
         }

         System.out.print("Do you want to guess again (true, false)?: ");
         boolean answer = scanner.nextBoolean();
         if (!answer) {
            break;
         }
      }
   }

}
