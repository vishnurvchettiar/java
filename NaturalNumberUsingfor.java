import java.util.Scanner;

public class NaturalNumberUsingfor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int sum=0;

        for (int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("The Sum of the Natural Number for give number "+n+" is "+sum);
    }
}
