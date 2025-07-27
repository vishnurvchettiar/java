import java.util.Scanner;

public class SimpleRestaurantBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Our Indian Pure Veg Hotel Restaurant ===");

        int total = 0;
        char moreOrder;

        do {
            System.out.println("\nMenu Categories:");
            System.out.println("1. Starters");
            System.out.println("2. Main Course");
            System.out.println("3. Desserts");
            System.out.println("4. Drinks");

            System.out.print("\nEnter the number of the category you want to order from (1-4): ");
            int category = scanner.nextInt();

            switch (category) {
                case 1:
                    System.out.println("Starters:");
                    System.out.println("1. Paneer Tikka - ₹150");
                    System.out.println("2. Veg Manchurian - ₹130");
                    System.out.println("3. Hara Bhara Kabab - ₹120");
                    System.out.print("Select your item (1-3): ");
                    int starterChoice = scanner.nextInt();
                    int starterPrice = 0;
                    String starterName = "";
                    switch (starterChoice) {
                        case 1: starterPrice = 150;
                            starterName = "Paneer Tikka"; break;
                        case 2: starterPrice = 130;
                            starterName = "Veg Manchurian"; break;
                        case 3: starterPrice = 120;
                            starterName = "Hara Bhara Kabab"; break;
                        default: System.out.println("Invalid item choice in Starters."); starterPrice = -1;
                    }
                    if (starterPrice != -1) {
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        total += starterPrice * quantity;
                        System.out.println("You ordered " + quantity + " x " + starterName + ".");
                    }
                    break;

                case 2:
                    System.out.println("Main Course:");
                    System.out.println("1. Paneer Butter Masala - ₹220");
                    System.out.println("2. Veg Biryani - ₹180");
                    System.out.println("3. Dal Tadka - ₹160");
                    System.out.print("Select your item (1-3): ");
                    int mainChoice = scanner.nextInt();
                    int mainPrice = 0;
                    String mainName = "";
                    switch (mainChoice) {
                        case 1: mainPrice = 220;
                            mainName = "Paneer Butter Masala"; break;
                        case 2: mainPrice = 180;
                            mainName = "Veg Biryani"; break;
                        case 3: mainPrice = 160;
                            mainName = "Dal Tadka"; break;
                        default: System.out.println("Invalid item choice in Main Course."); mainPrice = -1;
                    }
                    if (mainPrice != -1) {
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        total += mainPrice * quantity;
                        System.out.println("You ordered " + quantity + " x " + mainName + ".");
                    }
                    break;

                case 3:
                    System.out.println("Desserts:");
                    System.out.println("1. Gulab Jamun - ₹90");
                    System.out.println("2. Rasmalai - ₹100");
                    System.out.println("3. Kulfi - ₹80");
                    System.out.print("Select your item (1-3): ");
                    int dessertChoice = scanner.nextInt();
                    int dessertPrice = 0;
                    String dessertName = "";
                    switch (dessertChoice) {
                        case 1: dessertPrice = 90;
                            dessertName = "Gulab Jamun"; break;
                        case 2: dessertPrice = 100;
                            dessertName = "Rasmalai"; break;
                        case 3: dessertPrice = 80;
                            dessertName = "Kulfi"; break;
                        default: System.out.println("Invalid item choice in Desserts."); dessertPrice = -1;
                    }
                    if (dessertPrice != -1) {
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        total += dessertPrice * quantity;
                        System.out.println("You ordered " + quantity + " x " + dessertName + ".");
                    }
                    break;

                case 4:
                    System.out.println("Drinks:");
                    System.out.println("1. Masala Chai - ₹40");
                    System.out.println("2. Sweet Lassi - ₹60");
                    System.out.println("3. Fresh Lime Soda - ₹50");
                    System.out.print("Select your item (1-3): ");
                    int drinkChoice = scanner.nextInt();
                    int drinkPrice = 0;
                    String drinkName = "";
                    switch (drinkChoice) {
                        case 1: drinkPrice = 40;
                            drinkName = "Masala Chai"; break;
                        case 2: drinkPrice = 60;
                            drinkName = "Sweet Lassi"; break;
                        case 3: drinkPrice = 50;
                            drinkName = "Fresh Lime Soda"; break;
                        default: System.out.println("Invalid item choice in Drinks."); drinkPrice = -1;
                    }
                    if (drinkPrice != -1) {
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        total += drinkPrice * quantity;
                        System.out.println("You ordered " + quantity + " x " + drinkName + ".");
                    }
                    break;

                default:
                    System.out.println("Invalid category choice! Please select 1, 2, 3, or 4.");
            }

            System.out.print("\nDo you want to order another item? (y/n): ");
            moreOrder = scanner.next().charAt(0);

        } while (moreOrder == 'y' || moreOrder == 'Y');

        System.out.println("\nYour total bill is: ₹" + total);
        System.out.println("Thank you for dining with us!");
    }
}
