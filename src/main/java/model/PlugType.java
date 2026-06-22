package model;

/**
 * Enum of electrical plug types with description, norm, and region.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public enum PlugType {

   TYPE_F("Type-F", "CEE 7/4", "Europe"), TYPE_I("Type-I", "AS/NZS 3112", "Australia");

   private final String description;
   private final String norm;
   private final String region;

   PlugType(String description, String norm, String region) {
      this.description = description;
      this.norm = norm;
      this.region = region;
   }

   /** @return the human-readable description of the plug type */
   public String getDescription() {
      return description;
   }

   /** @return the norm/standard identifier (e.g. "CEE 7/4") */
   public String getNorm() {
      return norm;
   }

   /** @return the geographic region where this plug type is commonly used */
   public String getRegion() {
      return region;
   }

}
