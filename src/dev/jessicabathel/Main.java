package dev.jessicabathel;

public class Main {

    public static void main(String[] args) {
	    // Create a double variable with a value of 20.00
        double val1 = 20.00d;
        // Create a second variable of type double with the value 80.00
        double val2 = 80.00d;
        // Add both numbers together and multiply by 100.00
        double val3 = (val1 + val2) * 100.00d;
        // Use the remainder operator to figure out what the remainder from the result of operation in step 3 and 40.00
        double val4 = val3 % 40.00;
        // Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if it's not zero
        boolean remainder = val4 == 0 ? true : false;
        // Output the boolean variable
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(remainder);
        // Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
        if (!remainder) {
            System.out.printf("Got some remainder");
        }
    }
}
