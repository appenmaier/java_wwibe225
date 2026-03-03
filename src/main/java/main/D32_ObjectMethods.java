package main;

import java.time.LocalDate;

import model.Person;

/**
 * Object Methods
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D32_ObjectMethods {

   public static void main(String[] args) {
      Person person1 = new Person("Hans", 'm', LocalDate.of(2000, 5, 7));
      Person person2 = new Person("Peter", 'm', LocalDate.of(1977, 12, 31));
      Person person3 = new Person("Peter", 'm', LocalDate.of(1977, 12, 31));

      /* toString */
      System.out.println(person1.toString());
      System.out.println(person2.toString());
      System.out.println(person3.toString());

      /* equals */
      if (person2 == person3) {
         System.out.println("person2 == person3");
      }
      if (person2.equals(person3)) {
         System.out.println("person2.equals(person3)");
      }

      /* hashcode */
      System.out.println(person1.hashCode());
      System.out.println(person2.hashCode());
      System.out.println(person3.hashCode());
   }

}
