package utility;

/**
 * String Array Helper
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class StringArrayHelper {

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

   public static void print(String[] array) {
      System.out.print("[");
      for (int i = 0; i < array.length; i++) {
         String content = array[i];
         System.out.print(content + ", ");
      }
      System.out.println("]");
   }

}
