package gov.research;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[2];                        // name your Arrays in plural tense
        ages[0] = 29;
        ages[1] = 50;
        System.out.println(ages);                       // toString() called and gives memory address
        System.out.println(Arrays.toString(ages));      // prints all elements in the array as a String
        System.out.println(ages[0]);                    // prints element 1 on index 0

        double[] prices = {9.99, 37.49, 32.50, 49.96};
        System.out.println("prices has length: " + prices.length);
        System.out.println(Arrays.toString(prices)+ "\n");

        String[] names = {"jorge","jess","winchester","remington"};
        System.out.println(Arrays.toString(names) + "\n");

        for(String name : names) {
            System.out.println(name);
        }

        for(int i = 0; i < prices.length; i++) {
            System.out.println("Found a price $" + prices[i] + " at index " + i);
        }
    }
}