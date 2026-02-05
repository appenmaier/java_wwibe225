# Einführung in die Programmierung und Fortgeschrittene Programmierung (WWIBE225)

Dieses Repo beinhaltet sämtlichen Quellcode zu allen Demos sowie alle relevanten Informationen der Vorlesungen _Einführung in die Programmierung_ und _Fortgeschrittene Programmierung_ des Kurses WWIBE225.

## Links

- [Dokumentation](https://jappuccini.github.io/java-docs/production/)
- [Anleitung zum Arbeiten mit Git](https://jappuccini.github.io/java-docs/production/additional-material/instructions/git)
- [Musterlösungen Übungsaufgaben](https://github.com/appenmaier/java_exercises)
- [Musterlösungen Klausuraufgaben](https://github.com/appenmaier/java_exam_exercises)

## Unterlagen

- [Einführung in die Programmierung](java1.md)
- [Fortgeschrittene Programmierung](java2.md)

### Sonstiges

**Gestaltungsprinzipien**

| Abkürzung | Bedeutung |
| --------- | --------- |
| DRY | Don`t Repeat Yourself |

**Wichtige Klassen und Methoden**

| Klasse | Methode |
| ------ | ------- |
| PrintStream | print, printf, println |
| Random | nextInt |
| Scanner | next, nextBoolean, nextDouble, nextInt, nextLine |
| String | charAt, length |

**Beispielhafte Klasse**

```java
public class MainClass {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Name: ");
      String name = scanner.next();
      System.out.print("Alter: ");
      int age = scanner.nextInt();
      System.out.print("Geschlecht: ");
      char gender = scanner.next().charAt(0);
      System.out.print("Hobbies: ");
      scanner.nextLine();
      String hobbies = scanner.nextLine();

      System.out.println("name=" + name + ", age=" + age + ", gender=" + gender + ", hobbies=" + hobbies);
   }

}
```

**Schreibweisen**

| Schreibweise | Beispiel | Einsatzgebiet in Java |
| ------------ | -------- | --------------------- |
| Pascal Case | `MainClass` | Klassen |
| Camel Case | `firstName`, `getFirstName()` | Datenobjekte und Methoden |
| Snake Case | `FILE_NAME` | Konstanten |
| Kebab Case | `font-family` | CSS-Eigenschaften bei JavaFX |
