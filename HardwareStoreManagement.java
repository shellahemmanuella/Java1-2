// write a java program that manages a hardware store . The store must have a name, contact and where it is located, the store contains of different products . New products can be added to it. The store each new day and the store manager  keeps track of the new products. The store manager always updates these products based on the number in the stock once a new product has been bought, the manager updates the product name if required and can also delete a product .The manager presents a list of these products  to the boss with the total products in the store.

import java.util.ArrayList;
import java.util.Scanner;//The Scanner class provides various methods to read different types of input, such as integers, strings. 

class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

class HardwareStore {
    private String storeName;
    private String contact;
    private String location;
    private ArrayList<Product> products;

    public HardwareStore(String storeName, String contact, String location) {
        this.storeName = storeName;
        this.contact = contact;
        this.location = location;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(String productName, int newStock) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.setStock(newStock);
                break;
            }
        }
    }

    public void deleteProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                products.remove(product);
                break;
            }
        }
    }

    public void displayProducts() {
        System.out.println("Product List:");
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Stock: " + product.getStock());
        }
        System.out.println("Total Products: " + products.size());
    }
}

public class HardwareStoreManagement {
    public static void main(String[] args) {
        HardwareStore store = new HardwareStore("Shellah's Hardware Store", "0705161711", "Hardware city");

        // Adding initial products
        store.addProduct(new Product("Hammer", 90));
        store.addProduct(new Product("Screwdrivers", 34));
        store.addProduct(new Product("Wrenches", 150));

        try (Scanner scanner = new Scanner(System.in)) {
            // Adding a new product
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter stock quantity: ");
            int stock = scanner.nextInt();//an integer
            scanner.nextLine(); // Consume the remaining newline character

            store.addProduct(new Product(productName, stock));

            // Updating a product
            System.out.print("Enter product name to update: ");
            String productToUpdate = scanner.nextLine();
            System.out.print("Enter new stock quantity: ");
            int newStock = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            store.updateProduct(productToUpdate, newStock);

            // Deleting a product
            System.out.print("Enter product name to delete: ");
            String productToDelete = scanner.nextLine();

            store.deleteProduct(productToDelete);
        }

        // Displaying the product list
        store.displayProducts();
    }
}