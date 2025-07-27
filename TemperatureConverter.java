import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature :");
        float c= sc.nextInt();
        float f=(c * 9/5) + 32;
        System.out.println("The Conversion of temperature from Celsius to Fahrenheit is "+f);
    }
}
