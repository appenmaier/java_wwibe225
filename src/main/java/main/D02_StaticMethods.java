package main;

import utility.Calculator;
import utility.Printer;

/**
 * Demonstrates calling static methods from utility classes.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D02_StaticMethods {

   public static void main(String[] args) {
      Printer.printHelloWorld();
      Printer.printHelloWorld();
      Printer.printHelloWorld();
      Printer.printHelloWorld();
      Printer.printHelloWorld();

      Printer.printText("Hello");
      Printer.printText("Daniel");
      Printer.printText(",");
      Printer.printText("how are you?");

      int result = Calculator.add(5, 3);
      System.out.println(result);
   }

}
