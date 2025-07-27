import java.util.Scanner;

public class factorialofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int n= sc.nextInt();
        long fact=1;

        for (int i=1; i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The Factorial of the Number is "+fact);
    }
}
