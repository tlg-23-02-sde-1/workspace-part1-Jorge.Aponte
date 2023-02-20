/*
 * Application "main-class" (class with a main() class)
 * We'll create a few instances of Television and give them a basic test drive.
 */
class TelevisionClient {

    // STARTING point for any standalone Java application
    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances\n");
        /*
         * create an instance of Television, set its properties, and run turnOn + turnOFF methods
         * create a 2nd instance of Television and set its properties, and run turnOn + turnOFF methods
         * create a 3rd instance of Television with no properties, and run turnOn + turnOFF methods
         */
        // create an instance of Television and set its properties individually
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setDisplay(DisplayType.OLED);
        tv1.setVolume(Television.MAX_VOLUME);

        // create a 2nd instance of Television object via the brand-volume constructor
        Television tv2 = new Television("LG", Television.MIN_VOLUME, DisplayType.PLASMA);

        // create a 3rd instance of Television object via only brand.
        Television tv3 = new Television("Sony");

        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        System.out.println();

        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        System.out.println();

        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3); // toString automatically called. Most developers use this!
        System.out.println(Television.getInstanceCount() + " instances");
    }
}
