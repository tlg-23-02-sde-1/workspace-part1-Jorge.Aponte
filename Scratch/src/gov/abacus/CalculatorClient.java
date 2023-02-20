package gov.abacus;

import java.util.Arrays;

class CalculatorClient {
    public static void main(String[] args) {

        double sum = Calculator.add(3.0, 5.2);
        double sub = Calculator.subtract(3, 5);

        System.out.println("The sum is: " + sum);

        //shorter way to print the addition or other methods by having the method in the sout.

        // okay to pass int where doubles are called (32 bit int into a 64 bit double).
        System.out.println("The sum is: " + Calculator.add(3, 5));
        System.out.println("The difference is: " + Calculator.subtract(3, 5));

        System.out.println("10 is even? " + Calculator.isEven(10));

        System.out.println(); //blank line in the output

        // Method's can have same name but they must have a different parameter
        int winner = (Calculator.randomInt());
        int wenner = (Calculator.randomInt(5, 10));
        System.out.println("The winner is: " + wenner + "\n");

        int[] input = {2,6,6,5};
        System.out.println(Calculator.mean(2,6,6,5));       // should be 4.75
    }
}
