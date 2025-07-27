import java.util.Scanner;

public class CompoundAssignment {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of A:");
        int a= sc.nextInt();
        System.out.print("Enter the value of B:");
        int b= sc.nextInt();

        System.out.println("The value of a+=b is "+(a += b));
        System.out.println("The value of a-=b is "+(a -= b));
        System.out.println("The value of a*=b is "+(a *= b));
        System.out.println("The value of a/=b is "+(a /= b));
        System.out.println("The value of a!=b is "+(a != b));

    }
}
