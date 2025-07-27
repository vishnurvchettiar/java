import java.util.Scanner;

public class LetterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces to right-align
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Print letters starting from 'A' + i up to 'A' + n - 1
            for (int j = i; j < n; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch);
            }

            System.out.println(); // Move to next line
        }
    }
}
