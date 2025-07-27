import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        //for taking the user input.
        Scanner sc=new Scanner(System.in);
        //for getting the value of a from user.
        System.out.print("Enter the First Number:");
        int a=sc.nextInt();
        //for getting the value of b from user.
        System.out.print("Enter the Second Number:");
        int b=sc.nextInt();

        // Menu for operation
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
         }
    }

}

