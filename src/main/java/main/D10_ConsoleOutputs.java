package main;

import java.util.Locale;

/**
 * Console Outputs
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D10_ConsoleOutputs {

   public static void main(String[] args) {
      /* print- und println-Methoden */
      System.out.println("Text 1");
      System.out.print("Text 2");
      System.out.println("Text 3");
      System.out.println(true);
      System.out.println(44);

      System.out.println();

      /* printf-Methoden */
      // Aufbau einer Formatierungs-Regel: %[flags][width][.precision]conversion-character

      // String-Formatierungen (conversion-character s)
      String text = "Hallo";
      String name = "Hans";
      System.out.printf("%s %s%n", text, name);
      System.out.printf("%S %S%n", text, name); // Großbuchstabenkonvertierung
      System.out.printf("%20s %s%n", text, name); // Festlegen der Ausgabenlänge
      System.out.printf("%-20s %s%n", text, name); // linksbündige Ausgabe

      System.out.println();

      // Dezimalzahlen-Formatierungen (conversion-character d)
      System.out.println(1_000_000_000);
      System.out.printf("%,d%n", 1_000_000_000); // Festlegen des Tausendertrennzeichens
      System.out.printf(Locale.JAPAN, "%,d%n", 1_000_000_000);

      System.out.println();

      // Gleitkommazahlen-Formatierungen (conversion-character f)
      System.out.printf("%.2f%n", 3.9471923);

      System.out.println();

      // Beispiel: Notentabelle
      System.out.printf("| %-7s | %-10s | %-7s |%n", "ID", "Name", "Prozent");
      System.out.println("| ------- | ---------- | ------- |");
      System.out.printf("| %-7s | %-10s | %-7.1f |%n", "8172645", "Hans", 95.341);
      System.out.printf("| %-7s | %-10s | %-7.1f |%n", "1203653", "Peter", 40.716);
      System.out.printf("| %-7s | %-10s | %-7.1f |%n", "2912834", "Lisa", 28.827);
      System.out.printf("| %-7s | %-10s | %-7.1f |%n", "3982716", "Heidi", 88.359);
   }

}
