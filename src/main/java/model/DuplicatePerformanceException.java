package model;

/**
 * Checked exception thrown when a {@link Performance} is added to a festival more than once.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class DuplicatePerformanceException extends Exception {

   private static final long serialVersionUID = 1L;

   /**
    * Creates the exception with a message identifying the duplicate performance.
    *
    * @param performance the performance that already exists in the schedule
    */
   public DuplicatePerformanceException(Performance performance) {
      super("Performance " + performance + " exists already");
   }

}
