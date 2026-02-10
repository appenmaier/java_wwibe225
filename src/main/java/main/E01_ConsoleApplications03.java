package main;

import java.util.Random;
import java.util.Scanner;

/**
 * ConsoleApplications03
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

      /* Deklarationen */
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

      /* Initialisierungen */
      System.out.print("Spieler 1, Name: ");
      nameOfPlayer1 = scanner.next();
      System.out.print("Spieler 1, Kämpfer 1, Name: ");
      nameOfFighter1 = scanner.next();
      System.out.print("Spieler 1, Kämpfer, LP: ");
      healthPointsOfFighter1 = scanner.nextInt();

      System.out.print("Spieler 2, Name: ");
      nameOfPlayer2 = scanner.next();
      System.out.print("Spieler 2, Kämpfer 2, Name: ");
      nameOfFighter2 = scanner.next();
      System.out.print("Spieler 2, Kämpfer, LP: ");
      healthPointsOfFighter2 = scanner.nextInt();

      System.out.println();

      /* Spielablauf */
      /* Runde 1, Zug 1 */
      System.out.println("*-------*");
      System.out.println("* Zug 1 *");
      System.out.println("*-------*");

      System.out.println("Kämpfer von " + nameOfPlayer1 + ": " + nameOfFighter1 + " ("
            + healthPointsOfFighter1 + " LP)");
      System.out.println("Kämpfer von " + nameOfPlayer2 + ": " + nameOfFighter2 + " ("
            + healthPointsOfFighter2 + " LP)");

      valueOfDice1 = random.nextInt(1, 7);
      valueOfDice2 = random.nextInt(1, 7);
      valueOfDice3 = random.nextInt(1, 7);
      valueOfDice4 = random.nextInt(1, 7);
      valueOfDice5 = random.nextInt(1, 7);
      valueOfDice6 = random.nextInt(1, 7);
      valueOfDice7 = random.nextInt(1, 7);

      int totalHits = valueOfDice1 + valueOfDice2 + valueOfDice3 + valueOfDice4;
      int totalBlocks = valueOfDice5 + valueOfDice6 + valueOfDice7;
      int damageValue = totalHits - totalBlocks;

      healthPointsOfFighter2 = healthPointsOfFighter2 - damageValue;
      // healthPointsOfFighter2 -= damageValue;

      // Ausgabe
      System.out.println(nameOfFighter1 + " greift " + nameOfFighter2 + " an.");
      System.out.println(nameOfFighter1 + " würfelt " + valueOfDice1 + ", " + valueOfDice2 + ", "
            + valueOfDice3 + " und " + valueOfDice4 + ".");
      System.out.println(nameOfFighter1 + " erzielt " + totalHits + " Treffer.");
      System.out.println(nameOfFighter2 + " würfelt " + valueOfDice5 + ", " + valueOfDice6 + " und "
            + valueOfDice7 + ".");
      System.out.println(nameOfFighter2 + " erzielt " + totalBlocks + " Blocks.");
      System.out.println(nameOfFighter2 + " erleidet " + damageValue + " Schaden und hat noch "
            + healthPointsOfFighter2 + " LP.");

      System.out.println();

      /* Runde 2, Zug 2 */
      System.out.println("*-------*");
      System.out.println("* Zug 2 *");
      System.out.println("*-------*");

      System.out.println("Kämpfer von " + nameOfPlayer1 + ": " + nameOfFighter1 + " ("
            + healthPointsOfFighter1 + " LP)");
      System.out.println("Kämpfer von " + nameOfPlayer2 + ": " + nameOfFighter2 + " ("
            + healthPointsOfFighter2 + " LP)");

      valueOfDice1 = random.nextInt(1, 7);
      valueOfDice2 = random.nextInt(1, 7);
      valueOfDice3 = random.nextInt(1, 7);
      valueOfDice4 = random.nextInt(1, 7);
      valueOfDice5 = random.nextInt(1, 7);
      valueOfDice6 = random.nextInt(1, 7);
      valueOfDice7 = random.nextInt(1, 7);

      totalHits = valueOfDice1 + valueOfDice2 + valueOfDice3 + valueOfDice4;
      totalBlocks = valueOfDice5 + valueOfDice6 + valueOfDice7;
      damageValue = totalHits - totalBlocks;

      healthPointsOfFighter1 = healthPointsOfFighter1 - damageValue;
      // healthPointsOfFighter1 -= damageValue;

      // Ausgabe
      System.out.println(nameOfFighter2 + " greift " + nameOfFighter1 + " an.");
      System.out.println(nameOfFighter2 + " würfelt " + valueOfDice1 + ", " + valueOfDice2 + ", "
            + valueOfDice3 + " und " + valueOfDice4 + ".");
      System.out.println(nameOfFighter2 + " erzielt " + totalHits + " Treffer.");
      System.out.println(nameOfFighter1 + " würfelt " + valueOfDice5 + ", " + valueOfDice6 + " und "
            + valueOfDice7 + ".");
      System.out.println(nameOfFighter1 + " erzielt " + totalBlocks + " Blocks.");
      System.out.println(nameOfFighter1 + " erleidet " + damageValue + " Schaden und hat noch "
            + healthPointsOfFighter1 + " LP.");
   }

}
