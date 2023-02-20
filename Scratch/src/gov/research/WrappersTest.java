package gov.research;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "29";                             // String input
        int age = Integer.parseInt(ageInput);               // convert String to int
        Integer ageInteger = Integer.valueOf(ageInput);     // convert String to Integer object (Best to use this!)

        String popInput = "7000000000";                     // String input
        long pop = Long.parseLong(popInput);                // convert String to long
        Long popLong = Long.valueOf(popInput);              // convert String to Long Object (Best to use this!)

        String priceInput = "200.50";                       // String input
        double price = Double.parseDouble(priceInput);      // convert String to double
        Double priceDouble = Double.valueOf(priceInput);    // convert String to Double Object (Best to use this!)

        String twinsInput = "true";                         // String input
        boolean hasTwins = Boolean.parseBoolean(twinsInput);// convert String to boolean
        Boolean hasTwinsBoolean = Boolean.valueOf(twinsInput); // convert String to Boolean Object (Best to use this!)
    }
}