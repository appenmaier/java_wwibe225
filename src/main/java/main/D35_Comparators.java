package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Movie;
import model.MovieByRatingDescendingComparator;

/**
 * Demonstrates sorting with {@link java.util.Collections#sort} using both natural ordering
 * (via {@link Comparable}) and custom ordering (via {@link java.util.Comparator}) for integers,
 * strings, and custom objects.
 */
public class D35_Comparators {

   /**
    * Entry point – sorts lists of integers, strings, and {@link model.Movie} objects using natural
    * ordering ({@link Comparable}) and a custom {@link java.util.Comparator}, printing the results
    * before and after each sort.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      /* Numbers */
      List<Integer> numbers = new ArrayList<>();
      numbers.add(6);
      numbers.add(-2);
      numbers.add(-8);
      numbers.add(529);
      numbers.add(6);
      numbers.add(0);

      System.out.println(numbers);
      Collections.sort(numbers);
      System.out.println(numbers);

      /* Names */
      List<String> names = new ArrayList<>();
      names.add("Anna");
      names.add("anna");
      names.add("Bert");
      names.add("!x2");
      names.add("Xaver");
      names.add("Alf");

      System.out.println(names);
      Collections.sort(names);
      System.out.println(names);

      /* Movies */
      List<Movie> movies = new ArrayList<>();
      movies.add(new Movie("John Wick 4", "2023", 7.6));
      movies.add(new Movie("Disaster Movie", "2008", 1.9));
      movies.add(new Movie("Der Pate", "1972", 9.2));

      System.out.println(movies);
      Collections.sort(movies);
      System.out.println(movies);
      Collections.sort(movies, new MovieByRatingDescendingComparator());
      System.out.println(movies);
   }

}
