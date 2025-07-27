import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage:");
        float n = sc.nextFloat();

        if (n>90){
            System.out.println("The Grade for "+n+" is A.");
        } else if (n>=80 && 90>=n) {
            System.out.println("The Grade for "+n+" is B.");
        } else if (n>=70 && 80>=n) {
            System.out.println("The Grade for " + n + " is c.");
        }else {
            System.out.println("The Grade for "+n+" is D");
        }
    }
}
