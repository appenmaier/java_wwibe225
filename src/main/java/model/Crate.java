package model;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * A crate that holds a collection of {@link Body} objects.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 */
public record Crate(List<Body> bodies) {

   /**
    * Adds a body to this crate.
    *
    * @param body the body to add
    * @throws NullPointerException if {@code body} is {@code null}
    */
   public void addBody(Body body) throws NullPointerException {
      if (body == null) {
         throw new NullPointerException();
      }

      bodies.add(body);
   }

   /**
    * Returns the body with the highest volume, or an empty {@link Optional} if the crate is empty.
    *
    * @return an {@link Optional} containing the body with the highest volume
    */
   public Optional<Body> getBodyWithHighestVolume() {
      /* Variante A */
      // Optional<Body> bodyWithHighestVolume = Optional.empty(); // Body bodyWithHighestVolume =
      // null;
      //
      // double highestVolume = 0;
      //
      // for (Body b : bodies) {
      // if (b.getVolume() > highestVolume) {
      // highestVolume = b.getVolume();
      // bodyWithHighestVolume = Optional.of(b); // bodyWithHighestVolume = b;
      // }
      // }
      //
      // return bodyWithHighestVolume; // Optional.ofNullable(bodyWithHighestVolume);

      /* Variante B */
      return bodies.stream().max(Comparator.comparingDouble(Body::getVolume));
   }

   /**
    * Returns all {@link Sphere} instances contained in this crate.
    *
    * @return a list of spheres
    */
   public List<Sphere> getSpheres() {
      /* Variante A */
      // List<Sphere> spheres = new ArrayList<>();
      //
      // for (Body b : bodies) {
      // if (b instanceof Sphere) {
      // Sphere s = (Sphere) b;
      // spheres.add(s);
      // }
      // }
      //
      // return spheres;

      /* Variante B */
      return bodies.stream().filter(b -> b instanceof Sphere).map(b -> (Sphere) b).toList();

      /* Vaiante C */
      // return bodies.stream().filter(Sphere.class::isInstance).map(Sphere.class::cast).toList();
   }

}
