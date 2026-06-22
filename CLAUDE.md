# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

Teaching repository for the courses *Einführung in die Programmierung* (Programming I) and *Fortgeschrittene Programmierung* (Programming II), course WWIBE225. All source files are lecture demos or exercises — they are intentionally simple and self-contained.

## Build & Run

This is a Maven project targeting Java 21.

```bash
# Compile
mvn compile

# Run a specific demo class (no tests exist yet)
mvn exec:java -Dexec.mainClass="main.D01_HelloWorld"

# Generate Javadoc
mvn javadoc:javadoc
```

## Package Structure

```
src/main/java/
  main/      – Executable demo classes (D01–D33) and exercise classes (E01–E04)
  model/     – Entity/domain classes used by the demos
  utility/   – Stateless helper classes (Calculator, Printer, StringArrayHelper)
src/main/resources/
  persons.txt – Semicolon-delimited data file read by D29_JavaApi
```

There are no test sources yet (JUnit 5 and Mockito are declared in `pom.xml` but unused).

## Demo Class Naming

- `D##_<Topic>` — ordered lecture demonstrations; each class has a single `main` method showing one concept
- `E##_<Topic>` — exercise solutions

## Key Design Decisions

- `model/` classes use plain fields (no Lombok) at the early stages (`FlightConnection`, `Flight`) and getter/setter encapsulation in later ones (`Person`, `LightBulb`, etc.)
- The `Light` → `TableLight` / `FlashLight` hierarchy and the `WiredDevice` interface are the primary examples for inheritance and interfaces
- `Animal` → `LandAnimal` / `WaterAnimal` is the primary example for abstract classes and dynamic polymorphism
- `StringArray` (OOP) and `StringArrayHelper` (procedural) are intentionally parallel implementations of the same concept, used in D19 to contrast the two approaches
- `PlugType` and `Weekday` are the enum examples; `Color` is an enum with RGB fields

## Naming Conventions

| Style | Used for |
|-------|----------|
| PascalCase | Classes |
| camelCase | Variables and methods |
| SNAKE_CASE | Constants |
