import java.util.Scanner;

public class MainRestaurant {

    public static void main(String[] args) {
        // creating objects to store user choices
        Order myOrder = new Order();
        Scanner sc = new Scanner(System.in);

        // welcome message for user
        System.out.println("Hello! Welcome to the restaurant.\n");

        // prompting user for burger size
        // continue asking until valid input is entered
        while (true) {
            System.out.print("Do you want a single or double burger? ");
            String userBurger = sc.nextLine().toLowerCase();

            if (userBurger.equals("single") || userBurger.equals("double")) {
                // setting user's burger size
                myOrder.setBurger(userBurger);
                break; // exit loop with valid input
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }

        // prompting user for fries size
        // continue asking until valid input is entered
        while (true) {
            System.out.print("Do you want small or large fries? ");
            String userFries = sc.nextLine().toLowerCase();

            if (userFries.equals("small") || userFries.equals("large")) {
                // setting user's fries size
                myOrder.setFries(userFries);
                break; // exit loop with valid input
            } else {
                System.out.println("Invalid input! Please try again.");
            }
        }

        // prompting user for defined extras with fixed prices ($1 each)
        // prompting user for ketchup packet quantity
        int ketchupPackets = -1;
        while (ketchupPackets < 0) {
            System.out.print("If desired, please enter quantity of ketchup packets: ");
            ketchupPackets = sc.nextInt(); // loop breaks if condition is met

            if (ketchupPackets < 0) {
                System.out.println("Invalid input! Please try again.");
            }
        }

        // prompting user for dessert cookie quantity
        int dessertCookies = -1;
        while (dessertCookies < 0) {
            System.out.print("If desired, please enter quantity of dessert cookies: ");
            dessertCookies = sc.nextInt(); // loop breaks if condition is met

            if (dessertCookies < 0) {
                System.out.println("Invalid input! Please try again.");
            }
        }

        // setting extras, if any
        myOrder.setExtras(ketchupPackets + dessertCookies);

        // display order summary to user
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println("Burger Size: " + myOrder.getBurger());
        System.out.println("Fries Size: " + myOrder.getFries());
        System.out.println("Extras: " + myOrder.getExtras());
        System.out.println();

        System.out.printf("The price of your order is: $%.2f\n", myOrder.calcPrice());

        System.out.println();

        // closing message for user
        System.out.println("Thank you for visiting the restaurant!");

    }
}