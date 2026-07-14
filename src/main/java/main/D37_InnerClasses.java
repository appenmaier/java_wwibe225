package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import model.Movie;

/**
 * Demonstrates local classes, anonymous classes, lambda expressions, and method references
 * for sorting and iterating a list of movies.
 */
public class D37_InnerClasses {

   public static void main(String[] args) {
      List<Movie> movies = new ArrayList<>();
      movies.add(new Movie("John Wick 4", "2023", 7.6));
      movies.add(new Movie("Disaster Movie", "2008", 1.9));
      movies.add(new Movie("Der Pate", "1972", 9.2));

      System.out.println(movies);

      /* Sorting with Local Class */
      class MovieByYearAscendingComparator implements Comparator<Movie> {

         @Override
         public int compare(Movie movie1, Movie movie2) {
            return movie1.getPublishingYear().compareTo(movie2.getPublishingYear());
         }

      }
      Collections.sort(movies, new MovieByYearAscendingComparator());
      System.out.println(movies);

      /* Sorting with Anonymous Class */
      Collections.sort(movies, new Comparator<Movie>() {

         @Override
         public int compare(Movie movie1, Movie movie2) {
            return movie2.getTitle().compareTo(movie1.getTitle());
         }

      });
      System.out.println(movies);

      /* Sorting with Lambda Expression */
      Collections.sort(movies,
            (movie1, movie2) -> Double.compare(movie1.getRating(), movie2.getRating()));
      System.out.println(movies);
      System.out.println();

      /* Output with Loop */
      for (Movie m : movies) {
         System.out.println(m);
      }
      System.out.println();

      /* Output with Local Class */
      class PrintMovieConsumer implements Consumer<Movie> {

         @Override
         public void accept(Movie m) {
            System.out.println(m);
         }

      }
      movies.forEach(new PrintMovieConsumer());
      System.out.println();

      /* Output with Anonymous Class */
      movies.forEach(new Consumer<Movie>() {

         @Override
         public void accept(Movie m) {
            System.out.println(m);
         }

      });
      System.out.println();

      /* Output with Lambda Expression */
      movies.forEach(m -> System.out.println(m));
      System.out.println();

      /* Method References */
      movies.forEach(m -> System.out.println(m)); // Lambda Expression
      movies.forEach(System.out::println); // Method Reference

      movies.forEach(m -> m.incrementRating()); // Lambda Expression
      movies.forEach(Movie::incrementRating); // Method Reference
   }

}
