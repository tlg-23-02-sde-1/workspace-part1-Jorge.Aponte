package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv = new Television();

        tv.setVolume(0);                                    // should stick
        tv.setBrand("Samsung");                             // should stick
        System.out.println(tv);                             // should be Samsung and Volume 0

        tv.setVolume(100);                                  // should stick
        tv.setBrand("LG");                                  // should stick
        System.out.println(tv);                             // should be LG and Volume 100

        tv.setVolume(-1);                                   // error message, volume not set
        tv.setVolume(101);                                  // error message, volume not set
        System.out.println("Volume: " + tv.getVolume());    //should still be 100

        tv.setBrand("Samsung");                             // should stick
        System.out.println("Tv Brand: " + tv.getBrand());   // should be Samsung

        tv.setBrand("LG");                                  // should stick
        System.out.println("Tv Brand: " + tv.getBrand());   // should be LG

        tv.setBrand("Sony");                                // should stick
        System.out.println("Tv Brand: " + tv.getBrand());   // should be Sony

        tv.setBrand("Toshiba");                             // should stick
        System.out.println("Tv Brand: " + tv.getBrand());   // should be Toshiba

        tv.setBrand("INVALID");                             // error message, should not be set
        System.out.println("Tv Brand: " + tv.getBrand());   // should still show Toshiba, from before
    }
}