package main;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import model.Movies;
import model.Movies.Genre;
import model.Movies.Movie;

/**
 * Demonstrates the Java Stream API using a movie dataset.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class D40_JavaStreamApi {

   private static List<Movie> movies;

   public static void main(String[] args) {
      movies = Movies.getMovies();
      movies.forEach(System.out::println);
      System.out.println();

      /* filter, map, forEach */
      System.out.println(
            "Alle Thriller mit einer Bewertung von min. 7 in der Form \"Titel (Jahr)\" ausgegeben werden.");
      printAllThrillersWithRatingBE7();
      System.out.println();

      /* mapToInt/mapToDouble/mapToLong, average/sum */
      System.out.println("Die Durchschnittsbewertung aller Filme zurückgeben.");
      OptionalDouble averageRatingOfAllMovies = getAverageRatingOfAllMovies();
      System.out.println(averageRatingOfAllMovies);
      System.out.println();

      /* filter, sorted, limit/skip, forEach */
      System.out.println("Die 5 besten Horrorfilme ausgeben.");
      printTop5HorrorMovies();
      System.out.println();

      /* max/min/count */
      System.out.println("Den längsten Film zurückgeben.");
      Optional<Movie> longestMovie = getLongestMovie();
      System.out.println(longestMovie);
      System.out.println();

      /* filter, findAny/findFirst */
      System.out.println("Ein beliebiges Drama zurückgeben.");
      Optional<Movie> drama = getDrama();
      System.out.println(drama);
      System.out.println();

      /* anyMatch/allMatch/noneMatch */
      System.out.println("Gibt es einen Horrorfilm vor dem Jahr 1982?");
      boolean horrorMovieBefore1982 = horrorMovieBefore1982();
      System.out.println(horrorMovieBefore1982);
      System.out.println();

      /* filter, toList */
      System.out.println("Alle guten Filme als Liste zurückgeben.");
      List<Movie> goodMovies = getGoodMovies();
      goodMovies.forEach(System.out::println);
      System.out.println();

      /* map, sorted, toList */
      System.out.println("Alle Jahre als sortierte Liste zurückgeben.");
      List<String> allYears = allYears();
      allYears.forEach(System.out::println);
      System.out.println();
   }

   /** Prints all thrillers with a rating of at least 7.0 in the format "Title (Year)". */
   private static void printAllThrillersWithRatingBE7() {
      movies.stream()
            .filter(m -> m.genres().contains(Genre.THRILLER))
            .filter(m -> m.rating() >= 7.0)
            .map(m -> m.title() + " (" + m.year() + ")")
            .forEach(System.out::println);
   }

   /**
    * Returns the average rating of all movies.
    *
    * @return an {@link OptionalDouble} containing the average rating, or empty if the list is empty
    */
   private static OptionalDouble getAverageRatingOfAllMovies() {
      return movies.stream()
            .mapToDouble(m -> m.rating()) // .mapToDouble(Movie::rating)
            .average();
   }

   /** Prints the top 5 horror movies sorted by rating in descending order. */
   private static void printTop5HorrorMovies() {
      movies.stream()
            .filter(m -> m.genres().contains(Genre.HORROR))
            .sorted((m1, m2) -> Double.compare(m2.rating(), m1.rating()))
            .limit(5)
            .forEach(System.out::println);
   }

   /**
    * Returns the movie with the longest runtime.
    *
    * @return an {@link Optional} containing the longest movie, or empty if the list is empty
    */
   private static Optional<Movie> getLongestMovie() {
      return movies.stream()
            .max((m1, m2) -> Integer.compare(m1.runtimeInMinutes(), m2.runtimeInMinutes()));
   }

   /**
    * Returns any drama movie from the list.
    *
    * @return an {@link Optional} containing a drama movie, or empty if none exists
    */
   private static Optional<Movie> getDrama() {
      return movies.stream().filter(m -> m.genres().contains(Genre.DRAMA)).findAny();
   }

   /**
    * Returns whether there is any horror movie released before 1982.
    *
    * @return {@code true} if such a movie exists, {@code false} otherwise
    */
   private static boolean horrorMovieBefore1982() {
      return movies.stream()
            .anyMatch(m -> m.genres().contains(Genre.HORROR) && m.year().compareTo("1982") < 0);
   }

   /**
    * Returns all movies with a rating of at least 8.0.
    *
    * @return a list of movies with rating &ge; 8.0
    */
   private static List<Movie> getGoodMovies() {
      return movies.stream().filter(m -> m.rating() >= 8).toList();
   }

   /**
    * Returns a sorted list of distinct release years from all movies.
    *
    * @return a sorted list of year strings
    */
   private static List<String> allYears() {
      return movies.stream()
            .map(m -> m.year()) // .map(Movie::year)
            .distinct()
            .sorted()
            .toList();
   }

}
