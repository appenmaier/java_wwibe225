package main;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import model.Exam;
import model.Student;

/**
 * Demonstrates {@link java.util.HashMap} operations: putting, reading, checking, overriding
 * entries, and iterating via key set, value collection, entry set, and {@code forEach}.
 */
public class D38_Maps {

   public static void main(String[] args) {
      Map<Student, Exam> studentsWithExam = new HashMap<>();

      LocalDate today = LocalDate.now();

      /* Put values */
      studentsWithExam.put(new Student("8162034", "Hans"), new Exam(today, 2.8));
      studentsWithExam.put(new Student("7129906", "Peter"), new Exam(today, 4.6));
      studentsWithExam.put(new Student("1904868", "Lisa"), new Exam(today, 1.3));
      studentsWithExam.put(new Student("6620137", "Anna"), new Exam(today, 2.2));

      /* Print values */
      System.out.println(studentsWithExam);

      /* Read values */
      System.out.println(studentsWithExam.get(new Student("1904868", "Lisa")));

      /* Check values */
      System.out.println(studentsWithExam.containsKey(new Student("6620137", "Anna")));
      System.out.println(studentsWithExam.containsValue(new Exam(today, 1.0)));

      /* Override values */
      Exam oldExam = studentsWithExam.put(new Student("7129906", "Peter"), new Exam(today, 3.7));
      Exam newExam = studentsWithExam.get(new Student("7129906", "Peter"));
      System.out.println(oldExam + " -> " + newExam);

      /* Collections: Key Set */
      System.out.println("Names:");
      for (Student s : studentsWithExam.keySet()) {
         System.out.printf("%-10s [ ]%n", s.getName());
      }
      System.out.println();

      /* Collections: All Values */
      double total = 0;
      int size = studentsWithExam.values().size();
      for (Exam e : studentsWithExam.values()) {
         total += e.getGrade();
      }
      System.out.println("Average Grade: " + total / size);
      System.out.println();

      /* Collections: Entry Set */
      System.out.println("Grade list:");
      for (Entry<Student, Exam> entry : studentsWithExam.entrySet()) {
         Student s = entry.getKey();
         Exam e = entry.getValue();
         System.out.println(s.getId() + ": " + e.getGrade());
      }
      System.out.println();

      /* forEach */
      System.out.println("Grade list:");
      studentsWithExam.forEach((s, e) -> System.out.println(s.getId() + ": " + e.getGrade()));
   }

}
