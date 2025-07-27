import java.util.Scanner;

public class reversenumberpatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int n= sc.nextInt();

        for (int i=n; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j); // Print numbers increasing in each row
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
