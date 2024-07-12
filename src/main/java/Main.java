import java.util.ArrayList;
import java.util.Scanner;

// Main class to run the Inventory management system
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(); // Create an instance of Inventory
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        boolean exit = false; // Flag to control the main loop

        // Main loop to display menu and process user input
        while (!exit) {
            System.out.println("Menu: Add, Update, Display, Exit");
            String choice = scanner.nextLine(); // Read user choice

            switch (choice.toLowerCase()) {
                case "add":
                    // Adding a new product
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    inventory.addProduct(name, quantity, price);
                    break;
                case "update":
                    // Updating an existing product
                    System.out.print("Enter product name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    inventory.updateProduct(name, quantity);
                    break;
                case "display":
                    // Displaying all products in the inventory
                    inventory.displayInventory();
                    break;
                case "exit":
                    // Exiting the program
                    exit = true;
                    break;
                default:
                    // Invalid menu option
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close(); // Close the scanner
    }
}
