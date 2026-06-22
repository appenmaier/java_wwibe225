package main;

import java.util.Locale;

/**
 * Demonstrates console output using {@code print}, {@code println}, and {@code printf}
 * with various format specifiers for strings, integers, and floating point numbers.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D10_ConsoleOutputs {

   public static void main(String[] args) {
      /* print and println methods */
      System.out.println("Text 1");
      System.out.print("Text 2");
      System.out.println("Text 3");
      System.out.println(true);
      System.out.println(44);

      System.out.println();

      /* printf methods */
      // Format of a formatting rule: %[flags][width][.precision]conversion-character

      // string formatting (conversion-character s)
      String text = "Hello";
      String name = "Hans";
      System.out.printf("%s %s%n", text, name);
      System.out.printf("%S %S%n", text, name); // uppercase conversion
      System.out.printf("%20s %s%n", text, name); // setting output width
      System.out.printf("%-20s %s%n", text, name); // left-aligned output

      System.out.println();

      // decimal number formatting (conversion-character d)
      System.out.println(1_000_000_000);
      System.out.printf("%,d%n", 1_000_000_000); // setting the thousands separator
      System.out.printf(Locale.JAPAN, "%,d%n", 1_000_000_000);

      System.out.println();

      // floating point number formatting (conversion-character f)
      System.out.printf("%.2f%n", 3.9471923);

      System.out.println();

      // example: score table
      System.out.printf("| %-7s | %-10s | %-6s |%n", "ID", "Name", "Points");
      System.out.println("| ------- | ---------- | ------ |");
      System.out.printf("| %-7s | %-10s | %-6.1f |%n", "8172645", "Hans", 95.341);
      System.out.printf("| %-7s | %-10s | %-6.1f |%n", "1203653", "Peter", 40.716);
      System.out.printf("| %-7s | %-10s | %-6.1f |%n", "2912834", "Lisa", 28.827);
      System.out.printf("| %-7s | %-10s | %-6.1f |%n", "3982716", "Heidi", 88.359);
   }

}
