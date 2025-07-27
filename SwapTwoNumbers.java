import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value of A:");
        int a=sc.nextInt();
        System.out.print("Enter the Value of B:");
        int b= sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The value of A is "+a);
        System.out.println("The value of B is "+temp);
    }
}
