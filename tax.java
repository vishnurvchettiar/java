import java.util.Scanner;

public class tax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Amount :");
        int n= sc.nextInt();
        double tax = 0;

        if (n <= 500000) {
            tax = 0;
        } else if (n > 500000 && n <= 1000000) {
            tax = n * 0.20;
        } else {
            tax = n * 0.30;
        }

        double totalAmount = n + tax;
        System.out.println("Calculated Tax: ₹" + tax);
        System.out.println("Total Amount after Tax: ₹" + totalAmount);
    }
}
