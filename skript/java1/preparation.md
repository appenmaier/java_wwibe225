# Klausurvorbereitung

**StuffedCookie**

```java
public class StuffedCookie extends Cookie { // 1

   private final Recipe jam; // 0,5

   public StuffedCookie(String name, Recipe dough, Recipe jam) { // 0,5
      super(name, dough); // 1
      this.jam = jam; // 0,5
   } // 2

   public List<Ingredient> getIngredients() { // 0,5
      List<Ingredient> ingredients = new ArrayList<>(); // 0,5

      List<Ingredient> jamIngredients = jam.getIngredients();  // 0,5
      List<Ingredient> doughIngredients = super.getIngredients();  // 1

      for (Ingredient i : jamIngredients) { // 1
         ingredients.add(i); // 0,5
      }

      for (Ingredient i : doughIngredients) { // 1
         ingredients.add(i); // 0,5
      }

      return ingredients; // 0,5
   } // 6

} // 1,5
// 9,5
```

**CookieJar**

```java
public class CookieJar { // 0,5

   private final List<Cookie> cookies; // 0,5

   public CookieJar() { // 0,5
      cookies = new LinkedList<>(); // 0,5
      // cookies = new ArrayList<>(); // 0,5
   } // 1

   public void addCookie(Cookie cookie) { // 0,5
      cookies.add(cookie); // 0,5
   } // 1

   public StuffedCookie getStuffedCookie() { // 0,5
      StuffedCookie stuffedCookie = null; // 0,5

      for (Cookie c : cookies) { // 1
         if (c instanceof StuffedCookie) { // 1
            stuffedCookie = (StuffedCookie) c; // 1
            break; // + 0,5
         }
      }

      return stuffedCookie; // 0,5
   } // 4,5 +0,5

   public Cookie getCookieByName(String name) { // 0,5
      Cookie cookie = null; // 0,5

      for (Cookie c : cookies) { // 1
         if(c.getName().equals(name)) { // 1
            cookie = c; // 0,5
            break; // + 0,5
         }
      }

      return cookie; // 0,5
   } // 4 +0,5

} 1
// 1,5 +1
```

**ShapeReader**

```java
public class ShapeReader { // 0,5

   public static List<Shape> getShapes(File file) throws FileNotFoundException { // 0,5 +0,5
      List<Shape> shapes = new ArrayList<>(); // 0,5

      Scanner scanner = new Scanner(file); // 1

      while(scanner.hasNextLine()) { // 1    
         String line = scanner.nextLine(); // 1
         String[] tokens = line.split(";"); // 1

         if (tokens[0].equals("Circle")) { // 1
            double r = Double.parseDouble(tokens[1]); // 1
            // double r = Double.valueOf(tokens[1]); // 1
            Circle circle = new Circle(r); // 0,5
            shapes.add(circle); // 0,5
         } elseif (tokens[0].equals("Square")) { // 1
            double a = Double.parseDouble(tokens[1]); // 1
            Square square = new Square(a); // 0,5
            shapes.add(square); // 0,5
         } else { // 0,5
            double a = Double.parseDouble(tokens[1]); // 1
            double b = Double.parseDouble(tokens[2]); // 1
            Rectangle rectangle = new Rectangle(a, b); // 0,5
            shapes.add(rectangle); // 0,5
         }
      }

      scanner.close(); // 0,5

      return shapes; // 0,5
   } // 16,5 +0,5

} // 0,5
// 17 +0,5
```

**DiceGame3**
```java
public class DiceGame3 { // 0,5

   private static Player player1; // 0,5
   private static Player player2; // 0,5
   private static Scanner scanner; // 0,5

   public static void main(String[] args) { // 0,5

      scanner = new Scanner(System.in); // 0,5

      sysout("Name Spieler 1:"); // 0,5
      String name1 = scanner.next(); // 0,5
      // String name1 = scanner.nextLine(); // 0,5

      sysout("Name Spieler 2:"); // 0,5
      String name2 = scanner.next(); // 0,5

      sysout(); // +0,5

      player1 = new Player(name1); // 1
      player2 = new Player(name2); // 1

      while(player1.getHP() > 0 && player2.getHP() > 0) { // 1,5    
         sysout(name1 + ", Punkte: " + player1.getHealthPoints()); // 1
         sysout(player2.getName() + ", Punkte: " + player2.getHP()); // 1

         int value1 = player1.rollTheDice(); // 1
         sysout(name1 + "würfelt:"  + value1); // 0,5
         int value2 = player2.rollTheDice(); // 1
         sysout(name2 + "würfelt:" + value2); // 0,5

         if (value1 > value2) { // 1
            player2.reduceHP(1); // 0,5
            sysout(name2 + "verliert einen Punkt"); // 0,5
         } elseif (value2 > value1) { // 1
            player1.reduceHP(1); // 0,5
            sysout(name1 + "verliert einen Punkt"); // 0,5
         } 
      }

      sysout(); // +0,5

      if (player1.getHP() > player2.getHP()) { // 1
         sysout(name1 + "gewinnt"); // 0,5
      } else { // 0,5
         sysout(name2 + "gewinnt"); // 0,5
      }

   } // 18 +1

} // 2
// 20 +1
```

**DiceGame2**

```java
public class DiceGame2 { // 0,5

   private static List<ShapeDice> dices; // 0,5

   public static void main(String[] args) { // 0,5

      dices = ArrayList<>(); // 0,5
      for (int i = 0; i < 5; i++) { // 1
         ShapeDice shapeDice = new ShapeDice(); // 0,5
         dices.add(shapeDice); // 0,5
      } 

      int total = 0; // 0,5
      for (ShapeDice d : dices) { // 1
         ShapeSymbol symbol = d.rollTheDice(); // 1
         int corners = symbol.getCorners(); // 0,5
         total += corners; // 0,5

         if (symbol.equals(ShapeSymbol.CIRCLE)) { // 1
            total--;  // 0,5
         }
      }
      sysout(total); // 0,5
   } // 8,5

} // 1
// 9,5
```
