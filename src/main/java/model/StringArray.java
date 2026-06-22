package model;

/**
 * A dynamically growing array of Strings backed by a plain array.
 * Capacity doubles automatically when the array is full.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StringArray {

   public String[] array = new String[2];

   /**
    * Adds a value to the array, doubling its capacity if it is full.
    *
    * @param value the value to add
    */
   public void add(String value) {
      int size = size();
      if (size == array.length) {
         String[] tmp = new String[array.length * 2];
         for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
         }
         array = tmp;
      }

      for (int i = 0; i < array.length; i++) {
         String content = array[i];
         if (content == null) {
            array[i] = value;
            break;
         }
      }
   }

   /** @return the number of non-null elements */
   public int size() {
      int size = 0;

      for (int i = 0; i < array.length; i++) {
         String content = array[i];
         if (content != null) {
            size++;
         }
      }

      return size;
   }

   /** Prints all elements to the console in bracket notation. */
   public void print() {
      System.out.print("[");
      for (int i = 0; i < array.length; i++) {
         String content = array[i];
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(content);
      }
      System.out.println("]");
   }

}
