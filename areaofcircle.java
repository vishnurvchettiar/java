import java.util.Scanner;

public class areaofcircle {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle :");
        float r= sc.nextInt();
        float p= 3.14F;

        float area= p*r*r;
        float perimeter=2*p*r;

        System.out.println("The Area of the Circle is "+area);
        System.out.println("The Perimeter of the Circle is "+perimeter);
    }
}
