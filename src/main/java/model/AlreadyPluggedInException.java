package model;

/**
 * Checked exception thrown when a {@link WiredDevice} is plugged in while already connected.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class AlreadyPluggedInException extends Exception {

   private static final long serialVersionUID = 1L;

   /**
    * Constructs the exception with a default message.
    */
   public AlreadyPluggedInException() {
      super("Device is already plugged in");
   }

}
