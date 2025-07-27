import java.util.Scanner;

public class Countthenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Numbers:");
        int n=sc.nextInt();
        int i=0;

        for (;n>0;n=n/10){
         i++;
        }
        System.out.print(i);
    }
}
