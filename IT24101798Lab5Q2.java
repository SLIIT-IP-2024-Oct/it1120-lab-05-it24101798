import java.util.Scanner;

public class IT24101798Lab5Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int newMembers;
        do {
            System.out.print("Enter the number of new members introduced (>= 0): ");
            newMembers = scanner.nextInt();
        } while (newMembers < 0);

        
        String prize;
        switch (newMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone";
        }

        
        System.out.println("The customer is entitled to a " + prize + ".");

        scanner.close();  
    }
}