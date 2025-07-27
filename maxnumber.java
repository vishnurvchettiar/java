import java.util.Scanner;

public class maxnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("First Value: ");
        int a=sc.nextInt();
        System.out.print("Second Value: ");
        int b=sc.nextInt();
        System.out.print("Third Value: ");
        int c=sc.nextInt();

        if (a>=b && a>=c){
            System.out.println("The Max Number is "+a);
        }
        else if (b>=a && b>=c) {
            System.out.println("The Max Number is "+b);
        }
        else {
            System.out.println("The Max Number is "+c);
        } 
    }
}
