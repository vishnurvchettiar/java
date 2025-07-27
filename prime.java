import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        sc.close();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            int div = 2;
            while (div < n) {
                if (n % div == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }
        }

        if (isPrime) {
            System.out.println("It's a Prime Number");
        } else {
            System.out.println("It's not a Prime Number");
        }
    }
}
