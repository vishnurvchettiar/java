import java.util.Scanner;

public class OddEvenusingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        int n= sc.nextInt();
        //TernaryOperator
        String large=((n%2==0)?"This Number is Even":"This Number is Odd");
        System.out.println(large);

    }
}
