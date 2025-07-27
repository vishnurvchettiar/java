import java.util.Scanner;

public class GST {
    public static void main(String[] args) {
        //for taking the user input.
        Scanner sc=new Scanner(System.in);
        //for getting the value of a from user.
        System.out.print("Enter the Cost of Pen:");
        int a=sc.nextInt();
        //for getting the value of b from user.
        System.out.print("Enter the Cost of Pencil:");
        int b=sc.nextInt();
        System.out.print("Enter the Cost of Eraser:");
        int c=sc.nextInt();
        float GST= (a+b+c)*18/100;
        float amount=a+b+c+GST;
        System.out.println("The Bill Amount is "+amount);

    }
}
