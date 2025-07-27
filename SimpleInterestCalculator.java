import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount:");
        int p= sc.nextInt();
        System.out.print("Enter the Number of days:");
        int t= sc.nextInt();
        System.out.print("Enter the Rate:");
        float r= sc.nextFloat();

        int si=(int)(p*r*t) / 100;
        int amount=p+si;
        System.out.println("The Simple Interest of the Amount "+p+" is "+si);
    }
}
