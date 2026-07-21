package model;

import java.time.LocalTime;

/**
 * Immutable record representing a musical performance at a festival.
 * Natural ordering is by start time.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public record PerformanceRecord(String bandName, LocalTime startTime, MusicGenre genre) // 1,5
      implements Comparable<PerformanceRecord> { // 0,5

   @Override
   public int compareTo(PerformanceRecord other) { // 0,5
      return startTime.compareTo(other.startTime); // 1,5
   } // 2

} // 4
