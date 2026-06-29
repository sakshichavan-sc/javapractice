// //Reverse a Number
// Logic

// For each iteration:

// Get the last digit using % 10.
// Add it to the reversed number.
// Remove the last digit using / 10.

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input");
        int numbers=sc.nextInt();

        int reverse = 0;

        while (numbers >0){
            int digit =numbers % 10;

            reverse = reverse * 10 + digit;
            numbers=numbers/10;




        }
        System.out.println("reverse"+reverse);
        
    }
    
}
