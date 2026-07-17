package main;

import java.util.Optional;
import java.util.Random;

/**
 * Demonstrates {@link java.util.Optional} as a null-safe alternative to returning {@code null},
 * comparing the classic null-check approach with {@code Optional}-based equivalents.
 */
public class D39_Optionals {

   public static void main(String[] args) {
      /* Approach without Optionals */
      String text = getText();

      if (text != null) {
         System.out.println(text.toUpperCase());
      } else {
         System.out.println("null");
      }

      /* Approach with Optionals */
      Optional<String> text2 = getText2();

      if (text2.isPresent()) {
         System.out.println(text2.get().toUpperCase());
      } else {
         System.out.println("empty");
      }

      text2.ifPresentOrElse(t -> System.out.println(t.toUpperCase()),
            () -> System.out.println("empty"));
   }

   /**
    * Returns a randomly present or absent plain string (may be {@code null}).
    *
    * @return {@code "Hello World"} with 50 % probability, otherwise {@code null}
    */
   public static String getText() {
      String text = null;
      Random random = new Random();
      if (random.nextBoolean()) {
         text = "Hello World";
      }
      return text;
   }

   /**
    * Returns a randomly present or empty {@link Optional} wrapping a string.
    *
    * @return an {@code Optional} containing {@code "Hello World 2"} with 50 % probability,
    *         otherwise {@link Optional#empty()}
    */
   public static Optional<String> getText2() {
      Optional<String> text = Optional.empty();
      Random random = new Random();
      if (random.nextBoolean()) {
         text = Optional.of("Hello World 2");
      }
      return text;
   }

}
