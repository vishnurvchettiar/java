import java.util.Scanner;

public class factorialusingwhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int n= sc.nextInt();
        long fact=1;
        int i=n;

        while (i>0){
            fact=fact*i;
            i--;
        }
        System.out.println("The Factorial of the number "+n+" is "+fact);

    }
}
