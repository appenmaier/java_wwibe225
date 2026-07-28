package main;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

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
      List<String> allYearsSorted = getAllYearsSorted();
      allYearsSorted.forEach(System.out::println);
      System.out.println();
      allYearsSorted.reversed().forEach(System.out::println);
      System.out.println();

      /* flatMap, distinct, forEach */
      System.out.println("Alle Genres ausgeben.");
      printGenres();
      System.out.println();

      /* collect, Collectors.toSet/Collectors.toList */
      System.out.println("Alle Filme als Liste zurückgeben.");
      Set<Movie> allMovies = getAllMovies();
      allMovies.forEach(System.out::println);
      System.out.println();

      /* map, collect, Collectors.joining */
      System.out.println("Alle Filmtitel als kommaseparierte Zeichenkette zurückgeben.");
      String titles = getTitles();
      System.out.println(titles);
      System.out.println();

      /* collect, Collectors.partitioningBy */
      System.out.println("Filme partioniert nach Bewertung >= 7 zurückgeben.");
      Map<Boolean, List<Movie>> moviesPartitionedByRating = getMoviesPartitionedByRating();
      moviesPartitionedByRating
            .forEach((partition, movies) -> System.out.println(partition + ": " + movies));
      System.out.println();

      /* collect, Collectors.groupingBy */
      System.out.println("Alle Filme gruppiert nach Jahr ausgeben.");
      printAllMoviesByYear();

      /* collect, Collectors.groupingBy, Collectors.mapping, Collectors.toList/Collectors.joining */
      System.out.println("Alle Filmtitel gruppiert nach Jahr ausgeben.");
      printAllTitlesByYear();

      /* collect, Collectors.toMap */
      System.out.println("Anzahl der Genres je Titel zurückgeben.");
      Map<String, Integer> numberOfGenresByTitle = getNumberOfGenresByTitle();
      numberOfGenresByTitle.forEach((title, genres) -> System.out.println(title + ": " + genres));

      /*
       * collect: Collectors.groupingBy,
       * Collectors.averagingDouble/Collectors.summingDouble/Collectors.counting
       */
      System.out.println("Durchschnittliche Laufzeit in Minuten nach Jahr zurückgeben.");
      Map<String, Double> averageRunTimeInMinByYear = getAverageRunTimeInMinByYear();
      averageRunTimeInMinByYear.forEach(
            (year, averageRuntimeInMin) -> System.out.println(year + ": " + averageRuntimeInMin));
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
   private static List<String> getAllYearsSorted() {
      return movies.stream()
            .map(m -> m.year()) // .map(Movie::year)
            .distinct()
            .sorted()
            .toList();
   }

   /** Prints all distinct genres found across all movies. */
   private static void printGenres() {
      movies.stream().flatMap(m -> m.genres().stream()).distinct().forEach(System.out::println);
   }

   /**
    * Returns all movies as a {@link Set}.
    *
    * @return a set containing all movies
    */
   private static Set<Movie> getAllMovies() {
      return movies.stream().collect(Collectors.toSet());
   }

   /**
    * Returns all movie titles joined as a comma-separated string.
    *
    * @return a comma-separated string of movie titles
    */
   private static String getTitles() {
      return movies.stream().map(Movie::title).collect(Collectors.joining(", "));
   }

   /**
    * Partitions all movies into two groups based on whether their rating is at least 7.0.
    *
    * @return a map with {@code true} mapped to movies with rating &ge; 7.0 and {@code false} to the
    *         rest
    */
   private static Map<Boolean, List<Movie>> getMoviesPartitionedByRating() {
      return movies.stream().collect(Collectors.partitioningBy(m -> m.rating() >= 7));
   }

   /** Prints all movies grouped by release year. */
   private static void printAllMoviesByYear() {
      Map<String, List<Movie>> allMoviesByYear =
            movies.stream().collect(Collectors.groupingBy(Movie::year));

      allMoviesByYear.forEach((year, movies) -> System.out.println(year + ": " + movies));
   }

   /** Prints all movie titles grouped by release year, both as a list and as a joined string. */
   private static void printAllTitlesByYear() {
      Map<String, List<String>> allTitlesByYearAsList = movies.stream()
            .collect(Collectors.groupingBy(m -> m.year(),
                  Collectors.mapping(m -> m.title(), Collectors.toList())));
      allTitlesByYearAsList.forEach((year, titles) -> System.out.println(year + ": " + titles));

      Map<String, String> allTitlesByYearAsString = movies.stream()
            .collect(Collectors.groupingBy(m -> m.year(),
                  Collectors.mapping(Movie::title, Collectors.joining(", "))));
      allTitlesByYearAsString.forEach((year, titles) -> System.out.println(year + ": " + titles));
   }

   /**
    * Returns a map from each movie title to its number of genres.
    *
    * @return a map with movie titles as keys and genre counts as values
    */
   private static Map<String, Integer> getNumberOfGenresByTitle() {
      return movies.stream().collect(Collectors.toMap(Movie::title, m -> m.genres().size()));
   }

   /**
    * Returns the average runtime in minutes grouped by release year.
    *
    * @return a map with release years as keys and average runtimes as values
    */
   private static Map<String, Double> getAverageRunTimeInMinByYear() {
      return movies.stream()
            .collect(Collectors.groupingBy(Movie::year,
                  Collectors.averagingDouble(Movie::runtimeInMinutes)));
   }

}
