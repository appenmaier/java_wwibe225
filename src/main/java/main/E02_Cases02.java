package main;

import java.util.Scanner;

/**
 * Cases02
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E02_Cases02 {

   @SuppressWarnings("resource")
   public static void main(String[] args) {
      int operand1, operand2;
      char operator;
      double result;

      Scanner scanner = new Scanner(System.in);

      System.out.print("Gib bitte den ersten Operanden ein: ");
      operand1 = scanner.nextInt();

      System.out.print("Gib bitte den Operator ein: ");
      operator = scanner.next().charAt(0);

      System.out.print("Gib bitte den zweiten Operanden ein: ");
      operand2 = scanner.nextInt();

      if (operator == '+') {
         result = operand1 + operand2;
      } else if (operator == '-') {
         result = operand1 - operand2;
      } else if (operator == '*') {
         result = operand1 * operand2;
      } else if (operator == '/') {
         result = (double) operand1 / operand2;
      } else {
         System.err.println("Ungültiger Operator");
         return;
      }

      System.out.printf("Ergebnis: %d %s %d = %.2f%n", operand1, operator, operand2, result);
   }

}
