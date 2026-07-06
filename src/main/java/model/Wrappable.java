package model;

/**
 * Interface for objects that can be wrapped and unwrapped as a present.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public interface Wrappable {

   /**
    * Returns a short description of this item.
    *
    * @return a short description
    */
   String getDescription();

   /** Wraps this item. */
   void wrap();

   /** Unwraps this item. */
   void unwrap();

}
