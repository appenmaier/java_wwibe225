package utility;

/**
 * Utility methods for working with String arrays that grow dynamically.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StringArrayHelper {

   /**
    * Adds a value to the array, doubling its capacity if it is full.
    *
    * @param array the current array
    * @param value the value to add
    * @return the (possibly new) array containing the added value
    */
   public static String[] add(String[] array, String value) {
      int size = StringArrayHelper.size(array);
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

      return array;
   }

   /**
    * Returns the number of non-null elements in the array.
    *
    * @param array the array to count
    * @return number of non-null entries
    */
   public static int size(String[] array) {
      int size = 0;

      for (int i = 0; i < array.length; i++) {
         String content = array[i];
         if (content != null) {
            size++;
         }
      }

      return size;
   }

   /**
    * Prints all elements of the array to the console in bracket notation.
    *
    * @param array the array to print
    */
   public static void print(String[] array) {
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
