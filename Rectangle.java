import java.util.Scanner;

public class Rectangle {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length :");
        float l = sc.nextFloat();
        System.out.print("Enter the Breadth :");
        float b = sc.nextFloat();

        float area= l*b;
        System.out.println("The Area of the Rectangle is "+area);
    }
}
