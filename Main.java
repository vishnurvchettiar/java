import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //for taking the user input.
        Scanner sc=new Scanner(System.in);
        //for getting the value of a from user.
        System.out.print("Enter the First Number:");
        int a=sc.nextInt();
        //for getting the value of b from user.
        System.out.print("Enter the Second Number:");
        int b=sc.nextInt();
        //for getting the product of two number.
        int product=a*b;
        System.out.print("The Product of 2 Number:");
        System.out.println(product);

    }
}