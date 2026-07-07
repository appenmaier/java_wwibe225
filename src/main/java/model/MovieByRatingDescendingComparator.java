package model;

import java.util.Comparator;

/**
 * Compares two {@link Movie} objects by rating in descending order (highest rating first).
 */
public class MovieByRatingDescendingComparator implements Comparator<Movie> {

   /**
    * Compares two movies by rating, highest first.
    *
    * @param movie1 the first movie
    * @param movie2 the second movie
    * @return a negative integer, zero, or a positive integer if {@code movie1}'s rating is
    *         greater than, equal to, or less than {@code movie2}'s rating
    */
   @Override
   public int compare(Movie movie1, Movie movie2) {
      return Double.compare(movie2.getRating(), movie1.getRating());

      // Double rating1 = movie1.getRating();
      // Double rating2 = movie2.getRating();
      // return rating2.compareTo(rating1);

      // return Double.valueOf(movie2.getRating()).compareTo(movie1.getRating());
   }

}
