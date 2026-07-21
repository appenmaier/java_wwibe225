package model;

/**
 * Stage size category with a human-readable German description label.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public enum StageSize {

   SMALL("Klein"), MEDIUM("Mittel"), LARGE("Groß");

   private final String description;

   StageSize(String description) {
      this.description = description;
   }

   public String getDescription() {
      return description;
   }

}
