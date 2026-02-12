package main;

import java.util.Arrays;

/**
 * Arrays07
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class E04_Arrays07 {

   public static void main(String[] args) {
      int[] arrayOne = {1, 2, 3, 4};
      int[] arrayTwo = {5, 6, 7, 8};

      int lengthArrayOne = arrayOne.length;
      int lengthArrayTwo = arrayTwo.length;

      int[] arrayThree = new int[lengthArrayOne + lengthArrayTwo];

      for (int i = 0; i < lengthArrayOne; i++) {
         arrayThree[i] = arrayOne[i];
      }

      for (int i = 0; i < lengthArrayTwo; i++) {
         arrayThree[i + lengthArrayOne] = arrayTwo[i];
      }

      System.out.println(Arrays.toString(arrayThree));
   }

}
