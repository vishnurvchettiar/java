import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=n){
            sum+=i;
            i++;
        }
        System.out.println("The Sum of the Natural Number for "+n+" is "+sum);

    }
}
