import java.util.Scanner;
 
public class average {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);

        System.out.println("enter number1");
        double a = pt.nextDouble();

        System.out.println("enetr number 2");
        double b = pt.nextDouble();

        System.out.println("enter number 3");
        double c = pt.nextDouble();

        double avg = (a + b + c) / 3;
        System.err.println("average is" + avg);



        
    
    }
    
}
