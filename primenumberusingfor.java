import java.util.Scanner;

public class primenumberusingfor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= sc.nextInt();
        boolean isPrime=true;

        for (int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if (isPrime==true){
            System.out.println("The Number "+n+" is Prime");
        }else {
            System.out.println("The Number "+n+" is not an Prime");
        }
    }
}
