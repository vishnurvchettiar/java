import java.util.Scanner;

public class info {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name= sc.next();
        System.out.print("Enter your Age :");
        int age= sc.nextInt();
        System.out.print("Enter your CGPA :");
        float cgp= sc.nextFloat();

        System.out.println("The name of the user is "+name);
        System.out.println("The age of user is "+age);
        System.out.println("The CGPA of user is "+cgp);
    }
}
