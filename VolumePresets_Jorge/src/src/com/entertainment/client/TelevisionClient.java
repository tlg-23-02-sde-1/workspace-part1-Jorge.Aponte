package src.com.entertainment.client;

import src.com.entertainment.DisplayType;
import src.com.entertainment.Television;
import src.com.entertainment.VolumeLevel;

class TelevisionClient {

    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances\n");

        Television tv1 = new Television("Samsung", Television.MAX_VOLUME, DisplayType.OLED);

        Television tv2 = new Television("LG", Television.MIN_VOLUME, DisplayType.PLASMA);

        Television tv3 = new Television("Sony");                // default vol 0

        /**
         * Here's where I tested my code to verify that the volume is indeed set
         * I should have done this is Validation Testing, but I was lazy. (I'm Sorry)
         */

        tv1.setVolume(VolumeLevel.SOFT);                              // should set to 25
        System.out.println("TV1: Volume = " + tv1.getVolume());       // should display 25

        Television tv4 = new Television();
        tv4.setVolume(24);                                            // this should still work (as before)

        Television tv5 = new Television();
        tv5.setVolume(VolumeLevel.LOUD);                              // should set to 75

        System.out.println("TV4: Volume = " + tv4.getVolume());       // should print 24
        System.out.println("TV5: Volume = " + tv5.getVolume());       // should print 75

//        tv1.turnOn();
//        tv2.turnOn();
//        tv3.turnOn();
//
//        System.out.println();
//
//        tv1.turnOff();
//        tv2.turnOff();
//        tv3.turnOff();
//
//        System.out.println();

        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3);
        System.out.println(tv4);
        System.out.println(tv5);
        System.out.println(Television.getInstanceCount() + " instances");
    }
}