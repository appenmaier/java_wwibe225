package model;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Query methods for a festival schedule mapping performances to stages.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public record FestivalQueries(Map<Performance, Stage> schedule) {

   /**
    * Returns all band names from the schedule in alphabetical order.
    *
    * @return sorted list of band names
    */
   public List<String> getAllBandNamesSorted() { // 0,5
      return schedule.keySet() // 1
            .stream() // 0,5
            .map(Performance::getBandName) // 1
            .sorted() // 0,5
            // .sorted(String::compareTo) // 0,5
            // .sorted((b1, b2) -> b1.compareTo(b2)) // 0,5
            .toList(); // 0,5
   } // 4

   /**
    * Returns all distinct stages sorted by name in descending order.
    *
    * @return sorted list of distinct stages
    */
   public List<Stage> getAllStagesSortedByName() { // 0,5
      return schedule.values() // 1
            .stream() // 0,5
            .distinct() // 0,5
            .sorted((s1, s2) -> s2.name().compareTo(s1.name())) // 1
            .toList(); // 0,5
   } // 4

   /**
    * Groups all performances by their start time.
    *
    * @return map from start time to the list of performances at that time
    */
   public Map<LocalTime, List<Performance>> getPerformancesByStartTime() { // 0,5
      return schedule.keySet() // 1
            .stream() // 0,5
            .collect(Collectors.groupingBy(Performance::getStartTime)); // 1,5
   } // 3,5

   /**
    * Counts the number of stages that match the given size.
    *
    * @param size the stage size to filter by
    * @return number of stages with the specified size
    */
   public long numberOfStagesBySize(StageSize size) { // 0,5
      return schedule.values() // 1
            .stream() // 0,5
            .filter(s -> s.size().equals(size)) // 1
            // .filter(s -> s.size == size) // 1
            .count(); // 0,5
   } // 3,5

   /**
    * Groups band names by start time, collecting them into a list per time slot.
    *
    * @return map from start time to list of band names
    */
   public Map<LocalTime, List<String>> getBandNamesByStartTimeAsList() { // 0,5
      return schedule.keySet() // 1
            .stream() // 0,5
            .collect(Collectors.groupingBy(Performance::getStartTime, // 1,5
                  Collectors.mapping(Performance::getBandName, Collectors.toList()))); // 1,5
   } // 5

   /**
    * Groups band names by start time, joining them into a comma-separated string per time slot.
    *
    * @return map from start time to comma-separated band names
    */
   public Map<LocalTime, String> getBandNamesByStartTimeAsString() { // 0,5
      return schedule.keySet() // 1
            .stream() // 0,5
            .collect(Collectors.groupingBy(Performance::getStartTime, // 1,5
                  Collectors.mapping(Performance::getBandName, Collectors.joining(", ")))); // 1,5
   } // 5

   /**
    * Counts the number of bands performing at each start time.
    *
    * @return map from start time to the count of bands
    */
   public Map<LocalTime, Long> getNumberOfBandNamesByStartTime() { // 0,5
      return schedule.keySet() // 1
            .stream() // 0,5
            .collect(Collectors.groupingBy(Performance::getStartTime, // 1,5
                  Collectors.mapping(Performance::getBandName, Collectors.counting()))); // 1,5
   } // 5

}
