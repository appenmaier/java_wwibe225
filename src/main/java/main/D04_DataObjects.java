package main;

/**
 * Data Objects
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D04_DataObjects {

   /* Konstanten */
   public final static double PI = 3.14159265359;

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      /* Deklaration */
      int age;
      String name, firstName, familyName, firstNameAndFamilyName;
      double sizeInM;
      boolean isMale;

      /* Initialisierungen */
      age = 18;
      firstName = "Daniel";
      sizeInM = 1.79;
      isMale = true;

      /* Ausgabe */
      System.out.println("age: " + age);
      System.out.println("firstName: " + firstName);
      System.out.println("sizeInM: " + sizeInM);
      System.out.println("isMale: " + isMale);

      System.out.println("PI: " + D04_DataObjects.PI);

      /* Veränderliche Datenobjekte */
      age = 44;
      System.out.println("age: " + age);

      /* Unveränderliche Datenobjekte */
      final String text = "Java";
      // text = "Python";
   }

}
