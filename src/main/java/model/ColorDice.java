package model;

import java.util.Random;

/**
 * A six-sided dice that randomly produces a numeric value (1–6) and a color
 * ({@link DiceColor#RED}, {@link DiceColor#GREEN}, or {@link DiceColor#BLUE}).
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class ColorDice {

   private DiceColor color;
   private int value;

   /** Creates a new color dice and rolls it immediately. */
   public ColorDice() {
      rollTheDice();
   }

   /** Rolls the dice, assigning a new random value (1–6) and a new random color. */
   public void rollTheDice() {
      Random random = new Random();

      value = random.nextInt(1, 7);

      color = switch (random.nextInt(1, 4)) {
         case 1  -> DiceColor.RED;
         case 2  -> DiceColor.GREEN;
         default -> DiceColor.BLUE;
      };
   }

   /** @return the color shown on the last roll */
   public DiceColor getColor() {
      return color;
   }

   /** @return the numeric value (1–6) shown on the last roll */
   public int getValue() {
      return value;
   }

}
