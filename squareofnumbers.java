import java.util.Scanner;

public class squareofnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value:");
        int n= sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(i*i+",");
        }
    }
}
