package main;

import java.util.Scanner;

/**
 * Exercise: a simple calculator that reads two integer operands and an operator
 * ({@code +}, {@code -}, {@code *}, {@code /}) from the console and prints the result.
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

      System.out.print("Please enter the first operand: ");
      operand1 = scanner.nextInt();

      System.out.print("Please enter the operator: ");
      operator = scanner.next().charAt(0);

      System.out.print("Please enter the second operand: ");
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
         System.err.println("Invalid operator");
         return;
      }

      System.out.printf("Result: %d %s %d = %.2f%n", operand1, operator, operand2, result);
   }

}
