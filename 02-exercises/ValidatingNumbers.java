//Write a program that receives a sequence of command-line arguments representing integers.
//Ignore arguments that are not valid integers. For all valid numbers, calculate the minimum, maximum,
//sum, and average. Also count how many numbers are positive, negative, zero, even, and odd.
//The average must be printed as a double, even though the inputs are integers.
//If the user enters "q" as an argument, stop processing immediately and ignore everything
//after it.

import java.util.ArrayList;

public class ValidatingNumbers {
    public static void main(String[] args){

        // Initialize the list that will keep the arguments.
        ArrayList <Integer> lst = new ArrayList<>();

        // Add to the list with only valid int arguments, and break if 'q' appears.
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("q")) {
                break;
            }
            try {
                int x = Integer.parseInt(args[i]);
                lst.add(x);
            } catch (NumberFormatException e) {
                // ignore not valid integer arguments.
            }

        }

        // At this point, all the values are added to the list.
        // Check if the current lst is empty.
        if (lst.isEmpty()) {
            return;
        }

        // Finding Required Value.
        int total = 0;
        int total_positive = 0;
        int total_negative = 0;
        int total_zero = 0;
        int total_even = 0;
        int total_odd = 0;
        int curr_max = lst.get(0);
        int curr_min = lst.get(0);

        for (int i = 0; i < lst.size(); i++) {
            int curr = lst.get(i);
            if (curr > curr_max) {
                curr_max = lst.get(i);
            }
            if (curr < curr_min) {
                curr_min = lst.get(i);
            }
            if (curr > 0) {
                total_positive++;
            }
            else if (curr < 0) {
                total_negative++;
            }
            else {
                total_zero++;
            }
            if (curr % 2 == 0) {
                total_even++;
            }
            else {
                total_odd++;
            }
            total = total + lst.get(i);
        }
        System.out.println(curr_max);
        System.out.println(curr_min);
        System.out.println(total);
        System.out.println(total_positive);
        System.out.println(total_negative);
        System.out.println(total_zero);
        System.out.println(total_even);
        System.out.println(total_odd);

        // Finding average in double
        System.out.println((double)total/lst.size());
    }
}
