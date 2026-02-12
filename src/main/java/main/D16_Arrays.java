package main;

import java.util.Arrays;
import java.util.Random;

/**
 * Arrays
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D16_Arrays {

   public static void main(String[] args) {
      Random random = new Random();

      /* Deklaration und Initialisierung */
      int[] numbers = new int[100]; // { 2, 8, 9, 1,... };
      String[] names = {"Hans", "Peter", "Lisa"}; // new String[3];

      /* Zugriff auf einzelne Feld-Elemente */
      numbers[50] = 3;
      numbers[0] = 7;
      numbers[numbers.length - 1] = 5;

      names[1] = "Petra";

      System.out.println("numbers[0]: " + numbers[0]);
      System.out.println("numbers[50]: " + numbers[50]);
      System.out.println("numbers[99]: " + numbers[99]);
      System.out.println("numbers[6]: " + numbers[6]);
      System.out.println("names[1]: " + names[1]);

      int randomNumber = random.nextInt(0, names.length);
      System.out.println("names[randomNumber]: " + names[randomNumber]);

      /* Zugriff auf mehrere Feld-Elemente */
      int x = 0;

      while (x < numbers.length) {
         numbers[x] = random.nextInt(1, 10);
         x++;
      }

      /* Ausgabe von Feld-Elementen */
      for (int i = 0; i < numbers.length; i++) {
         int number = numbers[i];
         System.out.println(i + ": " + number);
      }
      System.out.println(names);
      System.out.println(Arrays.toString(names));
   }

}
