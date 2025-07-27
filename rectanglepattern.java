import java.util.Scanner;

public class rectanglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Loop through rows
        for (int i = 0; i < rows; i++) {
            // Loop through columns
            for (int j = 0; j < cols; j++) {
                // Print '*' for first & last row, or first & last column
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");  // Print space inside
                }
            }
            System.out.println();  // Move to next line after each row
        }
    }
}
