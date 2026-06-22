package main;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercise: a two-player turn-based dice combat game.
 * Each player names their fighter and assigns health points.
 * Fighters take turns attacking and blocking with dice until one falls.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E01_ConsoleApplications03 {

   @SuppressWarnings({"unused", "resource"})
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      int rounds = 0;

      /* declarations */
      String nameOfPlayer1;
      String nameOfPlayer2;

      String nameOfFighter1;
      int healthPointsOfFighter1;
      String nameOfFighter2;
      int healthPointsOfFighter2;

      int valueOfDice1;
      int valueOfDice2;
      int valueOfDice3;
      int valueOfDice4;
      int valueOfDice5;
      int valueOfDice6;
      int valueOfDice7;
      int valueOfDice8;
      int valueOfDice9;
      int valueOfDice10;

      /* initializations */
      System.out.print("Player 1, Name: ");
      nameOfPlayer1 = scanner.next();
      System.out.print("Player 1, Fighter 1, Name: ");
      nameOfFighter1 = scanner.next();
      System.out.print("Player 1, Fighter, HP: ");
      healthPointsOfFighter1 = scanner.nextInt();

      System.out.print("Player 2, Name: ");
      nameOfPlayer2 = scanner.next();
      System.out.print("Player 2, Fighter 2, Name: ");
      nameOfFighter2 = scanner.next();
      System.out.print("Player 2, Fighter, HP: ");
      healthPointsOfFighter2 = scanner.nextInt();

      System.out.println();

      /* game loop */
      while (healthPointsOfFighter1 > 0 && healthPointsOfFighter2 > 0) {
         rounds++;
         /* output */
         System.out.println("*---------*");
         System.out.println("* Round " + rounds + " *");
         System.out.println("*---------*");

         /* turn 1 */
         // output
         System.out.println("*--------*");
         System.out.println("* Turn 1 *");
         System.out.println("*--------*");

         System.out.println("Fighter of " + nameOfPlayer1 + ": " + nameOfFighter1 + " ("
               + healthPointsOfFighter1 + " HP)");
         System.out.println("Fighter of " + nameOfPlayer2 + ": " + nameOfFighter2 + " ("
               + healthPointsOfFighter2 + " HP)");
         System.out.println(nameOfFighter1 + " attacks " + nameOfFighter2 + ".");

         valueOfDice1 = random.nextInt(1, 7);
         valueOfDice2 = random.nextInt(1, 7);
         valueOfDice3 = random.nextInt(1, 7);
         valueOfDice4 = random.nextInt(1, 7);
         valueOfDice5 = random.nextInt(1, 7);
         valueOfDice6 = random.nextInt(1, 7);
         valueOfDice7 = random.nextInt(1, 7);

         int totalHits = valueOfDice1 + valueOfDice2 + valueOfDice3 + valueOfDice4;
         int totalBlocks = valueOfDice5 + valueOfDice6 + valueOfDice7;

         // output
         System.out.println(nameOfFighter1 + " rolls " + valueOfDice1 + ", " + valueOfDice2 + ", "
               + valueOfDice3 + " and " + valueOfDice4 + ".");
         System.out.println(nameOfFighter1 + " scores " + totalHits + " hits.");
         System.out.println(nameOfFighter2 + " rolls " + valueOfDice5 + ", " + valueOfDice6
               + " and " + valueOfDice7 + ".");
         System.out.println(nameOfFighter2 + " scores " + totalBlocks + " blocks.");

         if (totalHits > totalBlocks) {
            int damageValue = totalHits - totalBlocks;

            healthPointsOfFighter2 = healthPointsOfFighter2 - damageValue;
            // healthPointsOfFighter2 -= damageValue;

            // output
            System.out.println(nameOfFighter2 + " takes " + damageValue
                  + " damage and has " + healthPointsOfFighter2 + " HP left.");
         }

         System.out.println();

         /* check */
         if (healthPointsOfFighter2 <= 0) {
            continue;
         }

         /* turn 2 */
         // output
         System.out.println("*--------*");
         System.out.println("* Turn 2 *");
         System.out.println("*--------*");

         System.out.println("Fighter of " + nameOfPlayer1 + ": " + nameOfFighter1 + " ("
               + healthPointsOfFighter1 + " HP)");
         System.out.println("Fighter of " + nameOfPlayer2 + ": " + nameOfFighter2 + " ("
               + healthPointsOfFighter2 + " HP)");
         System.out.println(nameOfFighter2 + " attacks " + nameOfFighter1 + ".");

         valueOfDice1 = random.nextInt(1, 7);
         valueOfDice2 = random.nextInt(1, 7);
         valueOfDice3 = random.nextInt(1, 7);
         valueOfDice4 = random.nextInt(1, 7);
         valueOfDice5 = random.nextInt(1, 7);
         valueOfDice6 = random.nextInt(1, 7);
         valueOfDice7 = random.nextInt(1, 7);

         totalHits = valueOfDice1 + valueOfDice2 + valueOfDice3 + valueOfDice4;
         totalBlocks = valueOfDice5 + valueOfDice6 + valueOfDice7;

         // output
         System.out.println(nameOfFighter2 + " rolls " + valueOfDice1 + ", " + valueOfDice2 + ", "
               + valueOfDice3 + " and " + valueOfDice4 + ".");
         System.out.println(nameOfFighter2 + " scores " + totalHits + " hits.");
         System.out.println(nameOfFighter1 + " rolls " + valueOfDice5 + ", " + valueOfDice6
               + " and " + valueOfDice7 + ".");
         System.out.println(nameOfFighter1 + " scores " + totalBlocks + " blocks.");

         if (totalHits > totalBlocks) {
            int damageValue = totalHits - totalBlocks;

            healthPointsOfFighter1 = healthPointsOfFighter1 - damageValue;
            // healthPointsOfFighter1 -= damageValue;

            // output
            System.out.println(nameOfFighter1 + " takes " + damageValue
                  + " damage and has " + healthPointsOfFighter1 + " HP left.");
         }

         System.out.println();
      }
   }

}
