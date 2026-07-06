package main;

/**
 * Demonstrates variables, constants, mutability, and variable scope.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D04_DataObjects {

   /* constants */
   public final static double PI = 3.14159265359;

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      /* declaration */
      int age;
      String name, firstName, familyName, firstNameAndFamilyName;
      double sizeInM;
      boolean isMale;

      /* initializations */
      age = 18;
      firstName = "Daniel";
      sizeInM = 1.79;
      isMale = true;

      String fullName = "Daniel Appenmaier";

      /* output */
      System.out.println("age: " + age);
      System.out.println("firstName: " + firstName);
      System.out.println("sizeInM: " + sizeInM);
      System.out.println("isMale: " + isMale);

      System.out.println("PI: " + D04_DataObjects.PI);

      /* mutable data objects */
      age = 44;
      System.out.println("age: " + age);

      /* immutable data objects */
      final String text = "Java";
      // text = "Python";

      /* visibility of data objects */
      // i = 8;
      // x = 7;
      System.out.println(PI);
   }

   /**
    * Demonstrates variable scope: {@code x} and {@code i} are local to this method.
    *
    * @param x a local integer parameter
    */
   public static void doSomething(int x) {
      int i = 5;
      x = 7;
      System.out.println(i);
      System.out.println(PI);
   }

}
