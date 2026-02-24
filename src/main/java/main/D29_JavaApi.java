package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import model.Person;

/**
 * Java API
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D29_JavaApi {

   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<Person> persons = new ArrayList<>();

      // File file = new
      // File("C:\\Users\\D054906\\git\\java_wwibe225\\src\\main\\resources\\persons.txt"); //
      // absolute Pfadangabe
      File file = new File("src/main/resources/persons.txt"); // relative Pfadangabe
      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] tokens = line.split(";");

         String name = tokens[0];
         char gender = tokens[1].charAt(0);
         int year = Integer.parseInt(tokens[2]);
         int month = Integer.parseInt(tokens[3]);
         int day = Integer.parseInt(tokens[4]);
         LocalDate birthdate = LocalDate.of(year, month, day);

         Person person = new Person(name, gender, birthdate);
         persons.add(person);
      }

      scanner.close();

      System.out.println(persons);
   }

}
