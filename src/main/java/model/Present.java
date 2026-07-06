package model;

/**
 * Abstract base class for all presents.
 * Tracks whether the present is currently wrapped.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public abstract class Present implements Wrappable {

   private boolean isWrapped;

   @Override
   public void wrap() {
      isWrapped = true;
   }

   @Override
   public void unwrap() {
      isWrapped = false;
   }

   /** @return {@code true} if this present is currently wrapped */
   public boolean isWrapped() {
      return isWrapped;
   }

}
