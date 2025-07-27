import java.util.Scanner;

public class Circle {
        public static void main(String[] args) {
            //for taking the user input.
            Scanner sc=new Scanner(System.in);
            //for getting the value of r from user.
            System.out.print("Enter the Radius Number:");
            double r=sc.nextDouble();
            double pi=3.14;
            double area=pi*r*r;
            System.out.print("The Area of the circle = "+ area);
        }
}
