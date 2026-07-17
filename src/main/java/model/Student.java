package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/** Represents a student identified by a matriculation number and a name. */
@Data
@AllArgsConstructor
public class Student {

   private final String id;
   private final String name;

}
