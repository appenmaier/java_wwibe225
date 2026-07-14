package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents a movie with a title, publishing year, and IMDb-style rating. Natural ordering is
 * defined by title (alphabetically ascending).
 */
@Data
@AllArgsConstructor
public class Movie implements Comparable<Movie> {

   private final String title;
   private final String publishingYear;
   private double rating;

   /**
    * Compares this movie to another by title (alphabetical, case-sensitive).
    *
    * @param otherMovie the movie to compare to
    * @return a negative integer, zero, or a positive integer as this movie's title is less than,
    *         equal to, or greater than the other movie's title
    */
   @Override
   public int compareTo(Movie otherMovie) {
      return title.compareTo(otherMovie.getTitle());
   }

   /**
    * Increases the rating of this movie by 0.1.
    */
   public void incrementRating() {
      rating += 0.1;
   }

}
