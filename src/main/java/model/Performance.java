package model;

import java.time.LocalTime;

import lombok.Data;

/**
 * Represents a musical performance at a festival, with a band name, start time, and genre.
 * Natural ordering is by start time.
 */
@Data // 0,25
public class Performance // 0,5
      implements Comparable<Performance> { // 0,5

   private final String bandName; // 0,25
   private final LocalTime startTime; // 0,25
   private final MusicGenre genre; // 0,25

   @Override
   public int compareTo(Performance other) { // 0,5
      return startTime.compareTo(other.startTime); // 1,5
   } // 2

} // 4
