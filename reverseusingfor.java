import java.util.Scanner;

public class reverseusingfor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= sc.nextInt();
        int original=n;
        int rev=0;

        for (int rem;n>0;n=n/10){
            rem=n%10;
            rev=rev*10+rem;
        }
        System.out.println("The Reverse of the Number "+original+" is "+rev);
    }
}
