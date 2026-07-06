package model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents a dragon with a name, elemental type, and age.
 * Implemented using Lombok: {@code @Data} generates getters, setters,
 * {@code equals}, {@code hashCode}, and {@code toString};
 * {@code @AllArgsConstructor} generates the all-fields constructor.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
@Data
@AllArgsConstructor
public class DragonLombok {

   private final String name;
   private final DragonType type;
   private int age;

}
