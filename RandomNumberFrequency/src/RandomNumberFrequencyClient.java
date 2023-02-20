import java.util.ArrayList;
import java.util.Collections;

class RandomNumberFrequencyClient {

    public static void main(String[] args) {
        RandomNumberFrequency rand1 = new RandomNumberFrequency();
        ArrayList<Integer> numbers = new ArrayList<>();

        int min = 1;
        int max = 20;

        // invokes method 1000 times
        for (int i = 0; i < 1000; i++) {
            numbers.add(rand1.randomInt(min, max));
        }

        // returns frequency of number
        for (int i = min; i <= max; i++) {
            System.out.println(i + " was returned " + Collections.frequency(numbers, i) + " times");
        }
    }
}