package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Unit tests for the {@link Festival} record, covering schedule management and query methods.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class FestivalTest { // 0,5

   private Festival festival; // 0,5

   @Mock // 0,5
   private Stage smallStage; // 0,5

   @Mock // 0,5
   private Stage largeStage; // 0,5

   @Mock // 0,5
   private Performance rockPerformance1; // 0,5

   @Mock // 0,5
   private Performance rockPerformance2; // 0,5

   @Mock // 0,5
   private Performance rockPerformance3; // 0,5

   @Mock // 0,5
   private Performance popPerformance1; // 0,5

   @Mock // 0,5
   private Performance popPerformance2; // 0,5

   /** Initialises mocks and creates a fresh {@link Festival} before each test. */
   @BeforeEach // 0,5
   public void setUp() { // 0,5
      MockitoAnnotations.openMocks(this); // 1
      festival = new Festival("Rock & Pop 2026", new HashMap<>()); // 1
   } // 3

   /** Verifies that performances can be added and are present in the schedule. */
   @Test // 0,5
   public void testAddPerformance() throws DuplicatePerformanceException { // 0,5
      festival.addPerformance(popPerformance1, largeStage); // 1
      festival.addPerformance(rockPerformance1, smallStage); // 1
      festival.addPerformance(rockPerformance2, smallStage); // 1

      assertTrue(festival.schedule().containsKey(popPerformance1)); // 1
      assertTrue(festival.schedule().containsKey(rockPerformance1)); // 1
      assertTrue(festival.schedule().containsKey(rockPerformance2)); // 1
      assertFalse(festival.schedule().containsKey(rockPerformance3)); // 1
      assertNotNull(festival.schedule().get(rockPerformance2)); // 1
      assertEquals(smallStage, festival.schedule().get(rockPerformance1)); // 1,5
   } // 10,5

   /** Verifies that adding a duplicate performance throws {@link DuplicatePerformanceException}. */
   @Test // 0,5
   public void testAddPerformance2() throws DuplicatePerformanceException { // 0,5
      festival.addPerformance(popPerformance1, largeStage); // 1

      assertThrows(DuplicatePerformanceException.class,
            () -> festival.addPerformance(popPerformance1, largeStage)); // 2
      assertThrows(DuplicatePerformanceException.class,
            () -> festival.addPerformance(popPerformance1, smallStage)); // 2
   } // 6

   /** Verifies that the stage for a known band is returned correctly. */
   @Test // 0,5
   public void testGetStageByBandName() throws DuplicatePerformanceException { // 0,5
      festival.addPerformance(popPerformance1, largeStage); // 1
      festival.addPerformance(rockPerformance1, smallStage); // 1
      festival.addPerformance(rockPerformance2, smallStage); // 1

      when(rockPerformance1.getBandName()).thenReturn("Sportfreunde Stiller"); // 1
      when(rockPerformance2.getBandName()).thenReturn("Die Ärtze"); // 1
      when(popPerformance1.getBandName()).thenReturn("Lady Gaga"); // 1

      assertTrue(festival.getStageByBandName("Die Ärtze").equals(Optional.of(smallStage))); // 1,5
      assertEquals(Optional.of(smallStage), festival.getStageByBandName("Die Ärtze")); // 1,5
   } // 10

   /** Verifies that an empty {@link java.util.Optional} is returned for an unknown band name. */
   @Test // 0,5
   public void testGetStageByBandName2() throws DuplicatePerformanceException { // 0,5
      festival.addPerformance(rockPerformance1, smallStage); // 1

      when(rockPerformance1.getBandName()).thenReturn("Sportfreunde Stiller"); // 1

      assertEquals(Optional.empty(), festival.getStageByBandName("Die Ärtze")); // 1,5
   } // 4,5

   /** Verifies that performances are filtered by genre and returned in sorted order. */
   @Test // 0,5
   public void testGetPerformancesByGenre() throws DuplicatePerformanceException { // 0,5
      festival.addPerformance(popPerformance1, largeStage); // 1
      festival.addPerformance(rockPerformance1, smallStage); // 1
      festival.addPerformance(rockPerformance2, smallStage); // 1

      when(popPerformance1.getGenre()).thenReturn(MusicGenre.POP); // 1
      when(rockPerformance1.getGenre()).thenReturn(MusicGenre.ROCK); // 1
      when(rockPerformance2.getGenre()).thenReturn(MusicGenre.ROCK); // 1

      when(rockPerformance1.compareTo(rockPerformance2)).thenReturn(1); // 1
      when(rockPerformance2.compareTo(rockPerformance1)).thenReturn(-1); // 1

      List<Performance> rockPerformances = festival.getPerformancesByGenre(MusicGenre.ROCK); // 0,5
      assertTrue(rockPerformances.size() == 2); // 0,5
      assertTrue(rockPerformances.get(0).equals(rockPerformance2)); // 0,5
      assertTrue(rockPerformances.get(1).equals(rockPerformance1)); // 0,5

      assertEquals(0, festival.getPerformancesByGenre(MusicGenre.ELECTRONIC).size()); // 1,5
   } // 12,5

} // 54,5
