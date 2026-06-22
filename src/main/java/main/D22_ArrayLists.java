package main;

import java.util.ArrayList;

/**
 * Demonstrates {@link java.util.ArrayList} operations: add, insert, remove,
 * iterate, and print.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D22_ArrayLists {

   public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<>();

      /* append elements */
      names.add("Hans");
      names.add("Peter");

      /* insert elements */
      names.add(1, "Lisa");
      names.add(1, "Max");
      names.add(2, "Anna");

      /* remove elements */
      names.remove(0);
      names.remove("Anna");

      /* read elements */
      for (int i = 0; i < names.size(); i++) {
         String name = names.get(i);
         System.out.println(name);
      }

      /* print elements */
      System.out.println(names);
   }

}
