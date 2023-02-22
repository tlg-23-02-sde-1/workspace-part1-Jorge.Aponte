package com.entertainment;

import java.sql.SQLOutput;
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

    private boolean isMuted = false;
    private int oldVolume;

    // Constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) throws InvalidBrandException{
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) throws IllegalArgumentException, InvalidBrandException {
        this(brand);            // delegate to ctor above me for brand
        setVolume(volume);      // handle volume myself, by delegating to its setter
    }

    public Television(String brand, int volume, DisplayType display)
    throws IllegalArgumentException, InvalidBrandException {
        this(brand, volume);    // delegate to ctor above me for brand and volume
        setDisplay(display);    // handle display myself, by delegating to its setter
    }

    // business-oriented methods
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
            setVolume(MIN_VOLUME);
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
    // I am possibly going to throw a CHECKED exception (InvalidBrandException).
    // NOTE: because it's CHECKED, I *must* declare it in a 'throws' clause.
    // The compiler "checks" to make sure I'm doing this (to be a good citizen).
    public void setBrand(String brand) throws InvalidBrandException {
        if (!isValidBrand(brand)) {
            throw new InvalidBrandException("Invalid Brand: " + brand + ", Valid Brands: "
                    + Arrays.toString(VALID_BRANDS));
        }
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    // NOTE: I am possibly going to throw an UNCHECKED exception (IllegalArgumentException)
    // I do no need to "announce" this with 'throws' because it's unchecked
    // BUT I will, as a good citizen.
    public void setVolume(int volume) throws IllegalArgumentException {
        if (volume <= MAX_VOLUME && volume >= MIN_VOLUME) {
            this.volume = volume;
            isMuted = false;
        }
        else {
            throw new IllegalArgumentException(String.format("Invalid volume: %s, valid range is %s-%s\n",
                    volume, MIN_VOLUME, MAX_VOLUME));
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

        return String.format("Television: brand=%s, volume=%s, Display Type=%s",
                getBrand(), volumeString, getDisplay());
    }
}