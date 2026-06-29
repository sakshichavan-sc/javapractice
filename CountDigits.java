// //Count Digits
// Logic

// Keep dividing the number by 10 until it becomes 0.

 import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        System.out.println("Digits = " + count);

        sc.close();
    }
}