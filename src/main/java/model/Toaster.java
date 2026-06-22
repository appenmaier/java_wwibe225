package model;

/**
 * A toaster that implements the {@link WiredDevice} interface.
 * Prints a message when plugged in or unplugged.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Toaster implements WiredDevice {

   @Override
   public void plugIn() {
      System.out.println("I, the toaster, am now plugged in");
   }

   @Override
   public void pullThePlug() {
      System.out.println("I, the toaster, am now unplugged");
   }

}
