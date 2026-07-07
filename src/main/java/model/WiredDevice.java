package model;

/**
 * Interface for devices that can be plugged into and unplugged from a power source.
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public interface WiredDevice {

   /** Connects the device to a power source. */
   void plugIn() throws AlreadyPluggedInException;

   /** Disconnects the device from the power source. */
   void pullThePlug();

}
