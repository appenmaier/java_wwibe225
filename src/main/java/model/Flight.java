package model;

import java.time.LocalDate;

/**
 * Represents a concrete flight on a specific date with a price.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Flight {

   public FlightConnection flightConnection;
   public LocalDate flightDate;
   public double flightPriceInEuro;

}
