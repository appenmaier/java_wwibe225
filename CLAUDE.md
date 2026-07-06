# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

Teaching repository for the courses *Einführung in die Programmierung* (Programming I) and *Fortgeschrittene Programmierung* (Programming II), course WWIBE225. All source files are lecture demos or exercises — they are intentionally simple and self-contained.

## Build & Run

This is a Maven project targeting Java 21.

```bash
# Compile
mvn compile

# Run a specific demo class
mvn exec:java -Dexec.mainClass="main.D01_HelloWorld"

# Run tests
mvn test

# Generate Javadoc
mvn javadoc:javadoc
```

## Package Structure

```
src/main/java/
  main/      – Executable demo classes (D01–D33, D34+ for Prog II) and exercise classes (E01–E04)
  model/     – Entity/domain classes used by the demos
  utility/   – Stateless helper classes (Calculator, Printer, StringArrayHelper)
src/main/resources/
  persons.txt – Semicolon-delimited data file read by D29_JavaApi
```

JUnit 5 and Mockito are declared in `pom.xml`. Unit test demos live in `src/test/java/` (used in the *Fortgeschrittene Programmierung* / Advanced Coding lecture).

## Demo Class Naming

- `D##_<Topic>` — ordered lecture demonstrations; each class has a single `main` method showing one concept
- `E##_<Topic>` — exercise solutions

## Key Design Decisions

- `model/` classes use plain fields (no Lombok) at the early stages (`FlightConnection`, `Flight`) and getter/setter encapsulation in later ones (`Person`, `LightBulb`, etc.)
- The `Light` → `TableLight` / `FlashLight` hierarchy and the `WiredDevice` interface are the primary examples for inheritance and interfaces
- `Animal` → `LandAnimal` / `WaterAnimal` is the primary example for abstract classes and dynamic polymorphism
- `StringArray` (OOP) and `StringArrayHelper` (procedural) are intentionally parallel implementations of the same concept, used in D19 to contrast the two approaches
- `PlugType` and `Weekday` are the enum examples; `Color` is an enum with RGB fields

## Programming II Topics (Fortgeschrittene Programmierung / Advanced Coding)

Demos from D34 onward cover the following topics:

- **Comparators** — `Comparator` / `Comparable`, sorting with lambdas
- **Records** — immutable data carriers (`record` keyword, compact constructors)
- **Exceptions** — checked vs. unchecked, `try`/`catch`/`finally`, custom exception classes
- **Maps** — `HashMap`, `LinkedHashMap`, `TreeMap`; key/value operations
- **Optionals** — `Optional<T>`, `map`, `orElse`, `ifPresent`
- **Stream API** — `filter`, `map`, `sorted`, `collect`, `reduce`, method references
- **Generics** — generic classes and methods, bounded type parameters
- **Unit Tests** — JUnit 5 (`@Test`, `@BeforeEach`, assertions); test sources in `src/test/java/`
- **Mocks** — Mockito (`@Mock`, `when`/`thenReturn`, `verify`)

## Naming Conventions

| Style | Used for |
|-------|----------|
| PascalCase | Classes |
| camelCase | Variables and methods |
| SNAKE_CASE | Constants |

## Javadoc

Always generate short Javadoc comments in English for all classes and methods. Exceptions (no Javadoc required):
- Getters
- Setters
- Overridden `Object` methods (`toString`, `equals`, `hashCode`, etc.)
