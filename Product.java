// Class to represent a product in the inventory
public class Product {
    private String name; // Name of the product
    private int quantity; // Quantity of the product
    private double price; // Price of the product

    // Constructor to initialize product details
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter for the product name
    public String getName() {
        return name;
    }

    // Setter for the product quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Override the toString method to display product details
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
