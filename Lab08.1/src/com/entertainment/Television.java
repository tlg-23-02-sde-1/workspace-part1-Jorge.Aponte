package com.entertainment;

import java.util.Arrays;

/*
 * Business class to model the workings of a television set.
 * No main() method here.
 */
public class Television {
    // Class (static) variables - shared among all instances - these live up in that shared common area
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    private static boolean isValidBrand(String brand) {
        boolean foundBrand = false;
        for (String brands : VALID_BRANDS) {
            if (brand.equalsIgnoreCase(brands)) {
                foundBrand = true;
                break;
            }
        }
        return foundBrand;
    }

    // attributes or properties, called "fields" or "instance variables"
    private String brand = "Toshiba";
    private int volume;
    private DisplayType display = DisplayType.LED;  // null if we don't provide a default.

    // Television HAS-A Tuner - delegates to it for all things channel-related
    private Tuner tuner = new Tuner();  // instantiated internally, not exposed (no get/set)

    private boolean isMuted = false;
    private int oldVolume;              // not exposed via get/set methods - internal use only

    // Constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);        // delegate to setter for any validation/conversion it might be doing
    }

    public Television(String brand, int volume) {
        this(brand);            // delegate to ctor above me for brand
        setVolume(volume);      // handle volume myself, by delegating to its setter
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);    // delegate to ctor above me for brand and volume
        setDisplay(display);    // handle display myself, by delegating to its setter
    }

    // business-oriented methods
    public void changeChannel(String channel) {
        tuner.setChannel(channel);  // delegate to contained Tuner object
    }

    public String getCurrentChannel() {
        return tuner.getChannel();  // delegate to contained Tuner object
    }

    public void turnOn() {
        boolean isConnected = this.verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down your " + getBrand() + " TV");
    }

    public void mute() {
        if (!isMuted) {
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        } else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    // accessor methods - provide "controlled access" to the object's internal (private) data
    public String getBrand() {
        return brand;
    }

    // data constraint: must be "Samsung", "LG", "Sony", "Toshiba"
    // would use Enum in real life application since they are set constants.
    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.println("Invalid Brand: " + brand + ", Valid Brands: "
                    + Arrays.toString(VALID_BRANDS));
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume <= MAX_VOLUME && volume >= MIN_VOLUME) {
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.printf("Invalid volume: %s, valid range is %s-%s\n", volume, MIN_VOLUME, MAX_VOLUME);

//            System.out.println("Invalid volume: " + volume + ", valid range is "
//                    + MIN_VOLUME + "-" + MAX_VOLUME);
        }
    }

    public boolean isMuted() {
        return isMuted;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    //Private Methods usually placed before or after toString method
    private boolean verifyInternetConnection() {
        return true;    // fake implementation (obviously)
    }

    //toString
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume()); // Ternary Operator

        return String.format("Television: brand=%s, volume=%s, Display Type=%s, Channel=%s",
                getBrand(), volumeString, getDisplay(), getCurrentChannel());
    }
}