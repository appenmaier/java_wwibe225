package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.AlreadyPluggedInException;
import model.FlashLight;
import model.Light;
import model.TableLight;

/**
 * Demonstrates exception handling with {@code try/catch}, multi-catch blocks, and a custom
 * checked exception. Covers {@link ArrayIndexOutOfBoundsException},
 * {@link NullPointerException}, {@link java.util.InputMismatchException},
 * and {@link model.AlreadyPluggedInException}.
 */
public class D36_Exceptions {

   /**
    * Entry point – exercises several exception scenarios: out-of-bounds array access,
    * a null dereference, repeated scanner input until a valid integer is entered,
    * a safe downcast guarded by {@code instanceof}, and a custom checked exception
    * thrown when a device is plugged in twice.
    *
    * @param args command-line arguments (not used)
    */
   @SuppressWarnings("resource")
   public static void main(String[] args) {
      /* ArrayIndexOutOfBoundsException and NullPointerException */
      String[] names = {"Hans", "Peter", null};
      try {
         System.out.println(names[3]);
         String name = names[1];
         System.out.println(name.toUpperCase());
      } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
         System.out.println(e.getMessage());
      }

      /* InputMismatchException */
      Scanner scanner = new Scanner(System.in);
      boolean loop = true;
      while (loop) {
         try {
            System.out.print("Integer: ");
            int number = scanner.nextInt();
            System.out.println(number);
            loop = false;
         } catch (InputMismatchException e) {
            System.out.println("Try again");
         }
      }

      /* ClassCastException */
      Light light = new TableLight(); // Upcast
      if (light instanceof FlashLight) {
         FlashLight flashLight = (FlashLight) light; // Downcast
         flashLight.recharge();
      }

      TableLight tableLight = (TableLight) light; // Downcast
      try {
         tableLight.plugIn();
         tableLight.plugIn();
      } catch (AlreadyPluggedInException e) {
         System.out.println(e.getMessage());
      }
   }

}
