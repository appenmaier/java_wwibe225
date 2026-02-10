package main;

import java.util.Scanner;

/**
 * Branches
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D11_Branches {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Bitte Dein Alter eingeben: ");
      int age = scanner.nextInt();

      /* Einfachverzweigungen */
      if (age < 18) {
         System.out.println("Du bist minderjährig");
      } else {
         System.out.println("Du bist volljährig");
      }

      /* Verschachtelte Verzweigungen */
      if (age < 12) {
         System.out.println("Du bist ein Kind");
      } else if (age < 18) {
         System.out.println("Du bist ein Jugendlicher");
      } else if (age < 65) {
         System.out.println("Du bist ein Erwachsener");
      } else {
         System.out.println("Du bist ein alter Mensch");
      }

      /* Vergleichs-Operatoren: >, >=, <, <=, ==, != */
      /* Logische Operatoren: && (logisches Und), || (logisches Oder), ! (logische Verneinung */
   }

}
