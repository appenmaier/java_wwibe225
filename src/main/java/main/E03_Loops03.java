package main;

import java.util.Random;
import java.util.Scanner;

/**
 * Loops03
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

         System.out.print("Gib bitte Deinen Tipp ein: ");
         tip = scanner.nextInt();

         if (randomNumber > tip) {
            System.out.println("Leider falsch, die gesuchte Zahl ist größer");
         } else if (randomNumber < tip) {
            System.out.println("Leider falsch, die gesuchte Zahl ist kleiner");
         } else {
            System.out.println("Richtig. Du hast " + attempts + " Versuche benötigt");
            break;
         }

         System.out.print("Möchtest Du nochmals raten (true, false)?: ");
         boolean answer = scanner.nextBoolean();
         if (answer == false) {
            break;
         }
      }
   }

}
