import java.util.Scanner;

public class IT24101798Lab5Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        
        int smallest = num1;
        int largest = num1;

        
        smallest = Math.min(smallest, num2);
        smallest = Math.min(smallest, num3);
        largest = Math.max(largest, num2);
        largest = Math.max(largest, num3);

        
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);

        scanner.close();  
    }
}