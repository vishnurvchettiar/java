import java.util.Scanner;

public class oddnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value:");
        int n= sc.nextInt();
        int i = 1; // Start from 1

        while (i <= n) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
