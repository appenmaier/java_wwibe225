package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents the result of a student's exam, consisting of a date and a numeric grade.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
@Data
@AllArgsConstructor
public class Exam {

   private final LocalDate date;
   private double grade;

}
