import java.util.Scanner;

public class ReverseStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces to shift stars right
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Print stars with spaces in between
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to next line after each row
        }
    }
}
