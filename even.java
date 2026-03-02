// Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.
import java.util.ArrayList;

public class even {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(2);
        numbers.add(5);
        numbers.add(15);
        numbers.add(14);
        numbers.add(16);
        
        int sum = 0; //Initialize sum to 0
        // Use for eachloop to iterate ArrayLIst
        for (int num : numbers) {
            if (num % 2 == 0) {   //Check even number
                sum += num;
            }
        }
        System.out.println("Sum of even numbers: " + sum); // Print sum
    }
}
