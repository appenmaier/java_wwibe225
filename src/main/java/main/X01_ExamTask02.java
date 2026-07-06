package main;

import java.util.Scanner;

import model.ColorDice;
import model.DiceColor;

/**
 * Exam task: a color-prediction game using five {@link model.ColorDice} dice.
 * The player enters a target color; points are awarded when the predicted color
 * scores the highest total. The game ends when the winning-points threshold is reached.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class X01_ExamTask02 {

   private static Scanner scanner;
   private static int winningPoints;
   private static int currentPoints;
   private static int rounds;
   private static ColorDice[] dices;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);

      System.out.print("Gewinnpunkte: ");
      winningPoints = scanner.nextInt();

      dices = new ColorDice[5];

      for (int i = 0; i < dices.length; i++) {
         dices[i] = new ColorDice();
      }

      while (currentPoints < winningPoints) {
         rounds++;

         System.out.print("Farbe: ");
         String color = scanner.next();

         int red = 0;
         int green = 0;
         int blue = 0;

         for (int i = 0; i < dices.length; i++) {
            ColorDice dice = dices[i];
            dice.rollTheDice();

            if (dice.getColor().equals(DiceColor.RED)) {
               red += dice.getValue();
            } else if (dice.getColor().equals(DiceColor.GREEN)) {
               green += dice.getValue();
            } else {
               blue += dice.getValue();
            }
         }

         System.out.println("Rot: " + red);
         System.out.println("Grün: " + green);
         System.out.println("Blau: " + blue);

         if (color.equals("Rot") && red >= green && red >= blue) {
            currentPoints++;
            System.out.println("Richtig");
         } else if (color.equals("Blau") && blue >= green && blue >= red) {
            currentPoints++;
            System.out.println("Richtig");
         } else if (color.equals("Grün") && green >= red && green >= blue) {
            currentPoints++;
            System.out.println("Richtig");
         } else {
            System.out.println("Falsch");
         }
      }

      System.out.println("Runden: " + rounds);
   }

}
