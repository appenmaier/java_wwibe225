package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

/**
 * Immutable record representing a music festival with a name and a performance schedule.
 * The schedule maps each {@link Performance} to the {@link Stage} it is assigned to.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public record Festival(String name, Map<Performance, Stage> schedule) { // 1

   /**
    * Adds a performance to the schedule.
    *
    * @param performance the performance to add
    * @param stage       the stage on which the performance takes place
    * @throws DuplicatePerformanceException if the performance is already in the schedule
    */
   public void addPerformance(Performance performance, Stage stage) // 0,5
         throws DuplicatePerformanceException { // 0,5
      if (schedule.containsKey(performance)) { // 1
         throw new DuplicatePerformanceException(performance); // 1
      }

      schedule.put(performance, stage); // 1
   } // 4

   /**
    * Looks up the stage assigned to the band with the given name.
    *
    * @param bandName the name of the band to search for
    * @return an {@link Optional} containing the stage, or empty if no matching band is found
    */
   public Optional<Stage> getStageByBandName(String bandName) { // 0,5
      Optional<Stage> stage = Optional.empty(); // 1

      for (Entry<Performance, Stage> entry : schedule.entrySet()) { // 1
         Performance p = entry.getKey(); // 0,5
         Stage s = entry.getValue(); // 0,5

         if (p.getBandName().equals(bandName)) { // 1
            stage = Optional.of(s); // 1
            break; // + 1
         }
      }

      return stage; // 0,5
   } // 6

   /**
    * Returns all performances of the given genre, sorted by start time.
    *
    * @param genre the music genre to filter by
    * @return a sorted list of matching performances; empty if none found
    */
   public List<Performance> getPerformancesByGenre(MusicGenre genre) { // 0,5
      List<Performance> performances = new ArrayList<>(); // 0,5

      for (Performance p : schedule.keySet()) { // 1
         if (p.getGenre().equals(genre)) { // if (p.getGenre() == genre) { // 1
            performances.add(p); // 0,5
         }
      }

      Collections.sort(performances); // performances.sort(null); // 0,5

      return performances; // 0,5
   } // 4,5

} // 15,5
