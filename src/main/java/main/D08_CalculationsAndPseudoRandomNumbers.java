package main;

import java.util.Random;

/**
 * Demonstrates mathematical calculations using {@link Math} and pseudo-random
 * number generation using {@link java.util.Random}.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D08_CalculationsAndPseudoRandomNumbers {

   public static void main(String[] args) {
      /* mathematical calculations */
      double result = Math.sqrt(64);

      System.out.println("result: " + result);

      /* pseudo random numbers */
      int randomNumber;

      randomNumber = (int) (Math.random() * 100) + 1;
      System.out.println("randomNumber: " + randomNumber);

      Random random = new Random();
      randomNumber = random.nextInt(1, 101);
      System.out.println("randomNumber: " + randomNumber);
   }

}
