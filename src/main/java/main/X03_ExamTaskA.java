package main;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import model.DuplicatePerformanceException;
import model.Festival;
import model.MusicGenre;
import model.Performance;
import model.Stage;
import model.StageSize;

/**
 * Exam task A: demonstrates building a festival schedule and querying it by band name and genre.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public class X03_ExamTaskA {

   public static void main(String[] args) {
      Performance p1 = new Performance("Die Ärtze", LocalTime.of(12, 0, 0), MusicGenre.ROCK);
      Performance p2 = new Performance("Die Toten Hosen", LocalTime.of(13, 0, 0), MusicGenre.ROCK);
      Performance p3 = new Performance("Miley Cyrus", LocalTime.of(12, 0, 0), MusicGenre.POP);
      Performance p4 = new Performance("Justin Biber", LocalTime.of(13, 0, 0), MusicGenre.POP);

      Stage s1 = new Stage("Rockbühne", StageSize.LARGE);
      Stage s2 = new Stage("Popbühne", StageSize.MEDIUM);

      Map<Performance, Stage> schedule = new HashMap<>();
      Festival festival = new Festival("Rock&Pop 2026", schedule);
      try {
         festival.addPerformance(p1, s1);
         festival.addPerformance(p2, s1);
         festival.addPerformance(p3, s2);
         festival.addPerformance(p4, s2);
         festival.addPerformance(p4, s1);
      } catch (DuplicatePerformanceException e) {
         System.err.println(e.getMessage());
      }

      System.out.println(festival.getStageByBandName("Miley Cyrus"));
      System.out.println(festival.getPerformancesByGenre(MusicGenre.ROCK));
   }

}
