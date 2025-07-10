package mypackage;
import java.util.*;

public class fun {

    public void arithmeticOperations(int a, int b) {
        System.out.println("--- Arithmetic Operations ---");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        
        System.out.println("----------------------------------");
    }

    public void swap(int a, int b) {
        System.out.println("------- Before Swapping --------");
        System.out.println("a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("------- After Swapping -------");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("----------------------------------");
    }

    public int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
System.out.println("----------------------------------");
        return reversed;

    }

    public void Palindrome(int num) {
        int reversed = reverse(num);
        if (num == reversed) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is not a Palindrome.");
        }
        System.out.println("----------------------------------");
    }


    public static void main(String[] args) {
        fun f = new fun();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        f.arithmeticOperations(a, b);
        System.out.println("----------------------------------");
        f.swap(a, b);
        System.out.println("----------------------------------");

        System.out.print("Enter a number to reverse and check palindrome: ");
        int number = sc.nextInt();
        System.out.println("----------------------------------");

        int reversed = f.reverse(number);
        System.out.println("Reversed Number: " + reversed);

        f.Palindrome(number);


    }
}
