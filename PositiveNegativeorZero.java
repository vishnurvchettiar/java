import java.util.Scanner;

public class PositiveNegativeorZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        if (n>0){
            System.out.println("The Number is Positive");
        } else if (n<0) {
            System.out.println("The Number is Negative");
        }else {
            System.out.println("The Number is Zero");
        }

    }
}
