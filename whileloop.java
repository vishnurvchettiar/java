import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        int sum=0;
        int i=1;

        while(i<=num){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
