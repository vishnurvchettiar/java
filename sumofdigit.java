import java.util.Scanner;

public class sumofdigit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int originalNum = n;
            int result = 0;


            while (n > 0) {
                int digit = n % 10;
                result += digit;
                n /= 10;
            }
            System.out.println("The sum of "+originalNum+" is "+result);

        }
}

