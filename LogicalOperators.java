import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Logical AND (&&): both positive
        if (a > 0 && b > 0) {
            System.out.println("Both numbers are positive.");
        } else {
            System.out.println("Both numbers are not positive.");
        }

        // Logical OR (||): at least one greater than 100
        if (a > 100 || b > 100) {
            System.out.println("At least one number is greater than 100.");
        } else {
            System.out.println("Neither number is greater than 100.");
        }

    }
}
