package model;

/** Music genre with a human-readable description label. */
public enum MusicGenre {

   ROCK("Rock"), POP("Pop"), JAZZ("Jazz"), METAL("Metal"), ELECTRONIC("Electronic");

   private final String description;

   MusicGenre(String description) {
      this.description = description;
   }

   public String getDescription() {
      return description;
   }

}
