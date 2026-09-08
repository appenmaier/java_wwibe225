package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CrateTest {

   private Crate crate;

   @Mock
   private Sphere sphere2;

   @Mock
   private Sphere sphere3;

   @Mock
   private Sphere sphere4;

   @Mock
   private Body body;

   @BeforeEach
   void setUp() {
      MockitoAnnotations.openMocks(this);
      crate = new Crate(new ArrayList<>());
   }

   @Test
   void testAddBody() {
      crate.addBody(sphere3);
      crate.addBody(sphere4);

      assertTrue(crate.bodies().size() == 2); // assertFalse

      assertEquals(sphere3, crate.bodies().get(0)); // assertNotEquals
      assertEquals(sphere4, crate.bodies().get(1)); // assertNotEquals

      assertThrows(NullPointerException.class, () -> crate.addBody(null)); // assertDoesNotThrow
   }

   @Test
   void testGetBodyWithHighestVolume() {
      crate.addBody(sphere3);
      crate.addBody(sphere4);
      crate.addBody(body);

      when(body.getVolume()).thenReturn(2.0);
      when(sphere3.getVolume()).thenReturn(3.0);
      when(sphere4.getVolume()).thenReturn(4.0);

      assertEquals(Optional.of(sphere4), crate.getBodyWithHighestVolume());
   }

   @Test
   void testGetBodyWithHighestVolume2() {
      assertEquals(Optional.empty(), crate.getBodyWithHighestVolume());
   }

   @Test
   void testGetSpheres() {
      crate.addBody(sphere2);
      crate.addBody(sphere3);
      crate.addBody(body);
      crate.addBody(sphere4);

      assertEquals(3, crate.getSpheres().size()); // assertTrue(crate.getSpheres().size() == 3);
   }

   @Test
   void testGetSpheres2() {
      assertEquals(0, crate.getSpheres().size());
   }

}
