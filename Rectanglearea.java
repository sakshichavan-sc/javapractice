import java.util.Scanner;
public class Rectanglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        int lenght = sc.nextInt();

        System.out.println("enter the breadth");
        int breadth = sc.nextInt();

        int area=(lenght*breadth);
        System.out.println("the area is "+area);

    }
    
}
