import java.util.Scanner;

public class OnlineFoodOrderingSystem {
    int menu_choice, sub_menu, bill_amount = 0;
    char ans;
    String food_name = "\n";
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        OnlineFoodOrderingSystem obj = new OnlineFoodOrderingSystem();
        obj.food_order();
    }

    public void food_order() {
        do {
            System.out.println("Welcome to My Hotel");
            menu();
            System.out.println("Do you want to add more items? (Y/N)");
            ans = sc.next().charAt(0);
        } while (ans == 'y' || ans == 'Y');
        System.out.println("You have ordered:\n" + food_name);
        System.out.println("Total Bill: " + bill_amount);
        System.out.println("Thank you for coming");
    }

    public void menu() {
        System.out.println("1: Starters");
        System.out.println("2: Main Course");
        System.out.println("3: Desserts");
        System.out.println("4: Drinks");
        System.out.println("Select the menu item:");
        menu_choice = sc.nextInt();
        switch (menu_choice) {
            case 1:
                menu_starters();
                break;
            case 2:
                menu_main_course();
                break;
            case 3:
                menu_deserts();
                break;
            case 4:
                menu_drinks();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public void menu_starters() {
        System.out.println("Starters:");
        System.out.println("1. Paneer Tikka - ₹150");
        System.out.println("2. Veg Manchurian - ₹130");
        System.out.println("3. Hara Bhara Kabab - ₹140");
        sub_menu = sc.nextInt();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        switch (sub_menu) {
            case 1:
                bill_amount += 150 * quantity;
                food_name += "Paneer Tikka x" + quantity + " : ₹" + 150 * quantity + "\n";
                break;
            case 2:
                bill_amount += 130 * quantity;
                food_name += "Veg Manchurian x" + quantity + " : ₹" + 130 * quantity + "\n";
                break;
            case 3:
                bill_amount += 140 * quantity;
                food_name += "Hara Bhara Kabab x" + quantity + " : ₹" + 140 * quantity + "\n";
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public void menu_main_course() {
        System.out.println("Main Course:");
        System.out.println("1. Paneer Butter Masala - ₹220");
        System.out.println("2. Veg Biryani - ₹180");
        System.out.println("3. Dal Tadka - ₹160");
        sub_menu = sc.nextInt();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        switch (sub_menu) {
            case 1:
                bill_amount += 220 * quantity;
                food_name += "Paneer Butter Masala x" + quantity + " : ₹" + 220 * quantity + "\n";
                break;
            case 2:
                bill_amount += 180 * quantity;
                food_name += "Veg Biryani x" + quantity + " : ₹" + 180 * quantity + "\n";
                break;
            case 3:
                bill_amount += 160 * quantity;
                food_name += "Dal Tadka x" + quantity + " : ₹" + 160 * quantity + "\n";
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public void menu_deserts() {
        System.out.println("Desserts:");
        System.out.println("1. Gulab Jamun - ₹90");
        System.out.println("2. Rasmalai - ₹100");
        System.out.println("3. Kulfi - ₹80");
        sub_menu = sc.nextInt();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        switch (sub_menu) {
            case 1:
                bill_amount += 90 * quantity;
                food_name += "Gulab Jamun x" + quantity + " : ₹" + 90 * quantity + "\n";
                break;
            case 2:
                bill_amount += 100 * quantity;
                food_name += "Rasmalai x" + quantity + " : ₹" + 100 * quantity + "\n";
                break;
            case 3:
                bill_amount += 80 * quantity;
                food_name += "Kulfi x" + quantity + " : ₹" + 80 * quantity + "\n";
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public void menu_drinks() {
        System.out.println("Drinks:");
        System.out.println("1. Masala Chai - ₹40");
        System.out.println("2. Sweet Lassi - ₹60");
        System.out.println("3. Fresh Lime Soda - ₹50");
        sub_menu = sc.nextInt();
        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();
        switch (sub_menu) {
            case 1:
                bill_amount += 40 * quantity;
                food_name += "Masala Chai x" + quantity + " : ₹" + 40 * quantity + "\n";
                break;
            case 2:
                bill_amount += 60 * quantity;
                food_name += "Sweet Lassi x" + quantity + " : ₹" + 60 * quantity + "\n";
                break;
            case 3:
                bill_amount += 50 * quantity;
                food_name += "Fresh Lime Soda x" + quantity + " : ₹" + 50 * quantity + "\n";
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
