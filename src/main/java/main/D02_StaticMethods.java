package main;

import utility.Calculator;
import utility.Printer;

/**
 * Static Methods
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

      Printer.printText("Hallo");
      Printer.printText("Daniel");
      Printer.printText(",");
      Printer.printText("wie gehts?");

      int result = Calculator.add(5, 3);
      System.out.println(result);
   }

}
