package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents a person with a name, gender, and birthdate.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Person {

   private String name;
   private char gender;
   private final LocalDate birthdate;

   /**
    * Creates a new person.
    *
    * @param name      the person's full name
    * @param gender    the person's gender as a character (e.g. {@code 'm'} or {@code 'f'})
    * @param birthdate the person's date of birth
    */
   public Person(String name, char gender, LocalDate birthdate) {
      this.name = name;
      this.gender = gender;
      this.birthdate = birthdate;
   }

   /** @return the person's name */
   public String getName() {
      return name;
   }

   /** @param name the new name */
   public void setName(String name) {
      this.name = name;
   }

   /** @return the person's gender character */
   public char getGender() {
      return gender;
   }

   /** @param gender the new gender character */
   public void setGender(char gender) {
      this.gender = gender;
   }

   /** @return the person's date of birth */
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
