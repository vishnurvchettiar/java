import java.util.Scanner;

public class palindeome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        int original=n;
        int rev=0;

        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        if (original==rev){
            System.out.println("The number " +original + " is an palindeome ");
        }else {
            System.out.println("The number " +original+ " is not an palindeome");
        }
    }
}
