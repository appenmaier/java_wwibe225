package main;

import model.StringArray;
import utility.StringArrayHelper;

/**
 * Methods
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D19_Methods {

   public static void main(String[] args) {
      /* Prozedurale Lösung (Daten und Routinen getrennt) */
      String[] names = new String[2];

      StringArrayHelper.print(names);
      names = StringArrayHelper.add(names, "Hans");
      StringArrayHelper.print(names);
      names = StringArrayHelper.add(names, "Peter");
      StringArrayHelper.print(names);
      names = StringArrayHelper.add(names, "Lisa");
      StringArrayHelper.print(names);
      System.out.println(StringArrayHelper.size(names));

      System.out.println();

      /* Objektorientierte Lösung (Daten und Routinen verbunden) */
      StringArray names2 = new StringArray();

      names2.print();
      names2.add("Hans");
      names2.print();
      names2.add("Peter");
      names2.print();
      names2.add("Lisa");
      names2.print();
      System.out.println(names2.size());
   }

}
