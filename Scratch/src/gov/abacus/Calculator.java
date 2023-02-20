package gov.abacus;

/*
 * This is an "all-static" class, i.e., a class definition with nothing
 * but static methods. These are called from the client as Calculator.methodName();
 */
class Calculator {

    /**
     * Returns the arithmetic mean (average) of the supplied integers.
     */

    public static double mean(int first, int... rest){
        double sum = first;
        for (int value : rest) {
            sum += value;   // sum = sum + value   (increment sum by value)
        }
        return sum / (rest.length + 1);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0; // known as modular or remainder but honestly say mod
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns a random integer between 1 and 14.
     * <p>
     * HINT: see a class called Math in the Java API (package java.lang)
     * Look for a helpful method here to get you started
     * NOTE: these methods in the MAth class are all "static," which means you call them as so:
     * Math.methodName()
     */

    public static int randomInt() {
        return randomInt(1, 14); // delegate to the min-max method with a 1 and 14.
    }

    public static int randomInt(int max) {
        return randomInt(1, max);
    }

    /**
     * Returns a random integer between 'min' and 'max' (inclusive)
     * We use the same method as above for simplicity from the client perspective
     * That is, the client has two "flavors" of randomInt to choose from.
     * This is called method "overloading"
     */
    public static int randomInt(int min, int max) {

        double rand = (int) Math.round((Math.random() * (max - min)) + min);
        return (int) rand;
    }
}