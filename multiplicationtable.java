import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int n= sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println("The Multiplication table of "+n+" :");
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
