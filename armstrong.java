import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int originalNum = num;
        int result = 0;
        int n = 0;

        // Count number of digits
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        temp = num;

        // Calculate sum of nth powers of digits
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, n);
            temp /= 10;
        }

        // Check if the number is an Armstrong number
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
