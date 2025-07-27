import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        //for taking the user input.
        Scanner sc=new Scanner(System.in);
        //for getting the value of a from user.
        System.out.print("Enter the First Number:");
        int a=sc.nextInt();
        //for getting the value of b from user.
        System.out.print("Enter the Second Number:");
        int b=sc.nextInt();
        int add=a+b;
        int div=a/b;
        int sub=a-b;
        int mod=a%b;
        int multiple=a*b;
        System.out.println("The Addition of 2 Number="+add);
        System.out.println("The Subtraction of 2 Number="+sub);
        System.out.println("The Division of 2 Number="+div);
        System.out.println("The Modules of 2 Number="+mod);
        System.out.println("The Multiplication of 2 Number="+multiple);
    }
}
