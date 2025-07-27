import java.util.Scanner;

public class SumUntilZerousingwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 1; // start with any non-zero value

        while (num != 0) {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("Total sum is: " + sum);

    }
}
