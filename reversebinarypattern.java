import java.util.Scanner;

public class reversebinarypattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int n= sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces to right-align the pattern
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Print binary pattern, which gets shorter each row
            for (int j = 0; j < n - i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }

            System.out.println(); // Move to next line after each row
        }
    }
}
