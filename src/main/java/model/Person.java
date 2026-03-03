package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Person
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Person {

   private String name;
   private char gender;
   private final LocalDate birthdate;

   public Person(String name, char gender, LocalDate birthdate) {
      this.name = name;
      this.gender = gender;
      this.birthdate = birthdate;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public char getGender() {
      return gender;
   }

   public void setGender(char gender) {
      this.gender = gender;
   }

   public LocalDate getBirthdate() {
      return birthdate;
   }

   @Override
   public int hashCode() {
      return Objects.hash(birthdate, gender, name);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      Person other = (Person) obj;
      return Objects.equals(birthdate, other.birthdate) && gender == other.gender
            && Objects.equals(name, other.name);
   }

   @Override
   public String toString() {
      return "Person [name=" + name + ", gender=" + gender + ", birthdate=" + birthdate + "]";
   }

}
