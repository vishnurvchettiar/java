import java.util.Scanner;

public class IncrementandDecrement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int a= sc.nextInt();

        // Post-increment
        System.out.println("Post-increment:");
        System.out.println("a++ = " + (a++));   // Still 5, then a becomes 6
        System.out.println("After Post-increment (a++): a = " + a); // 6

        // Pre-increment
        System.out.println("\nPre-increment:");
        System.out.println("++a = " + (++a));   // b becomes 6, then prints 6
        System.out.println("After Pre-increment (++a): a = " + a); // 6

        // Post-decrement
        System.out.println("\nPost-decrement:");
        System.out.println("a-- = " + (a--));   // Still 6, then a becomes 5
        System.out.println("After Post-decrement (a--): a = " + a); // 5

        // Pre-decrement
        System.out.println("\nPre-decrement:");
        System.out.println("--a = " + (--a));   // b becomes 5, then prints 5
        System.out.println("After Pre-decrement (--a): a = " + a); // 5

    }
}
