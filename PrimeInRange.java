import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter minimum value: ");
        int min = sc.nextInt();

        System.out.print("Enter maximum value: ");
        int max = sc.nextInt();

        System.out.println("Prime numbers between " + min + " and " + max + ":");

        // Loop through range and check primes
        for (int num = min; num <= max; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    //for checking if the number is prime or not.
    static boolean isPrime(int n) {
        if (n <= 1) return false;  // 1 and below are not prime
        for (int i = 2; i <= n / 2; i++) { // loop to check factors
            if (n % i == 0) return false; // found a factor, not prime
        }
        return true; // no factors found, it's prime
    }
}
