package model;

/**
 * Immutable data carrier for a dragon, implemented as a Java {@code record}.
 * Provides {@code name()}, {@code type()}, and {@code age()} accessors as well as
 * auto-generated {@code equals}, {@code hashCode}, and {@code toString}.
 *
 * @param name the dragon's name
 * @param type the elemental type of the dragon
 * @param age  the dragon's age in years
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public record DragonRecord(String name, DragonType type, int age) {

}
