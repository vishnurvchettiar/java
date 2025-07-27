import java.util.Scanner;

public class numberofvowelsinstringusingwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String n = sc.next();

        int i = 0;
        int count = 0;

        while (i < n.length()) {
            char ch = Character.toLowerCase(n.charAt(i)); // make it case-insensitive

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

            i++;
        }

        System.out.println("Number of vowels: " + count);

    }
}
