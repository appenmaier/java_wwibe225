package model;

/**
 * Represents a book that can be given as a present.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Book extends Present {

   private final String title;
   private final String author;

   /**
    * Creates a new book present.
    *
    * @param title  the book's title
    * @param author the book's author
    */
   public Book(String title, String author) {
      this.title = title;
      this.author = author;
   }

   public String getTitle() {
      return title;
   }

   public String getAuthor() {
      return author;
   }

   @Override
   public String getDescription() {
      return title + " " + author;
   }

}
