import java.util.Scanner;

public class largestdigitusingwhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count = 1;
        int largest = Integer.MIN_VALUE;

        while (count <= 3) {
            System.out.print("Enter value " + count + ": ");
            int num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }

            count++;
        }

        System.out.println("The largest number is: " + largest);

    }
}
