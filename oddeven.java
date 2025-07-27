import java.util.Scanner;

public class oddeven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a= sc.nextInt();

        if (a%2==0){
            System.out.println("It's an Even Number");
        }else {
            System.out.println("It's an Odd Number");
        }
    }
}
