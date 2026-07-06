package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents Santa Claus, who carries a bag of presents.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class SantaClaus {

   private final List<Present> presents;

   /** Creates a new Santa Claus with an empty bag. */
   public SantaClaus() {
      presents = new ArrayList<>();
   }

   /**
    * Adds a present to Santa's bag.
    *
    * @param present the present to add
    */
   public void addPresent(Present present) {
      presents.add(present);
   }

   /** @return the list of all presents in Santa's bag */
   public List<Present> getPresents() {
      return presents;
   }

   /** @return the number of {@link Toy} presents in the bag */
   public int getNumberOfToys() {
      int numberOfToys = 0;

      for (Present p : presents) {
         if (p instanceof Toy) {
            numberOfToys++;
         }
      }

      return numberOfToys;
   }

   /** Wraps all presents in the bag. */
   public void wrapAllPresents() {
      for (Present p : presents) {
         p.wrap();
      }
   }

}
