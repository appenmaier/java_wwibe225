package main;

import java.util.ArrayList;
import java.util.List;

import model.FlashLight;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Interfaces
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class D33_Interfaces {

   @SuppressWarnings("unused")
   public static void main(String[] args) {
      TableLight tableLight1 = new TableLight();
      TableLight tableLight2 = new TableLight();
      FlashLight flashLight = new FlashLight();
      Toaster toaster1 = new Toaster();
      Toaster toaster2 = new Toaster();

      List<WiredDevice> wiredDevices = new ArrayList<>(); // Upcast

      wiredDevices.add(toaster1); // Upcast
      wiredDevices.add(tableLight1); // Upcast
      wiredDevices.add(toaster2); // Upcast
      wiredDevices.add(tableLight2); // Upcast
      // wiredDevices.add(flashLight);

      for (WiredDevice wiredDevice : wiredDevices) {
         wiredDevice.plugIn(); // Dynamische Polymorphie
         if (wiredDevice instanceof TableLight) {
            TableLight tableLight = (TableLight) wiredDevice; // Downcast
            tableLight.switchOn();
            System.out.println(tableLight);
         }
      }
   }

}
