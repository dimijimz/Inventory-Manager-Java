import java.util.ArrayList;

// Class to manage the inventory of products
public class Inventory {
    private ArrayList<Product> products; // List to store products

    // Constructor to initialize the inventory list
    public Inventory() {
        products = new ArrayList<>();
    }

    // Method to add a new product to the inventory
    public void addProduct(String name, int quantity, double price) {
        Product newProduct = new Product(name, quantity, price); // Create a new product
        products.add(newProduct); // Add the product to the list
        System.out.println("Product " + name + " added with quantity " + quantity + " and price $" + price);
    }

    // Method to update the quantity of an existing product
    public void updateProduct(String name, int quantity) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setQuantity(quantity); // Update quantity if product is found
                System.out.println("Product " + name + " updated to quantity " + quantity);
                return;
            }
        }
        System.out.println("Product not found"); // Message if product does not exist
    }

    // Method to display all products in the inventory
    public void displayInventory() {
        for (Product product : products) {
            System.out.println(product); // Display each product's details
        }
    }
}
