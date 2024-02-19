import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Enum for product categories
enum ProductCategory {
    PHONE,
    LAPTOP,
    FURNITURE
}

// Product interface
interface Product {
    void displayInfo();
}

// Concrete product classes
class Phone implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Phone Product");
    }
}

class Laptop implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Laptop Product");
    }
}

class Furniture implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Furniture Product");
    }
}

// Singleton ProductManager enum
enum ProductManager {
    INSTANCE;

    private Map<ProductCategory, Product> productMap;

    // Private constructor to initialize products
    private ProductManager() {
        productMap = new HashMap<>();
        initializeProducts();
    }

    // Method to initialize products
    private void initializeProducts() {
        productMap.put(ProductCategory.PHONE, new Phone());
        productMap.put(ProductCategory.LAPTOP, new Laptop());
        productMap.put(ProductCategory.FURNITURE, new Furniture());
    }

    // Method to display product information based on category
    public void displayProductInfo(ProductCategory category) {
        if (productMap.containsKey(category)) {
            Product product = productMap.get(category);
            product.displayInfo();
        } else {
            System.out.println("Invalid product category");
        }
    }
}

// Main class
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("PRODUCT MANAGEMENT");
            System.out.println("-------------------");
            System.out.println("1. Phone");
            System.out.println("2. Laptop");
            System.out.println("3. Furniture");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                if (choice >= 1 && choice <= 3) {
                    ProductCategory category = getProductCategory(choice);
                    ProductManager.INSTANCE.displayProductInfo(category);
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }

            System.out.println("Press Enter key to continue...");
            scanner.nextLine(); // Wait for Enter key

        } while (true);

        scanner.close();
    }

    // Helper method to map user choice to ProductCategory
    private static ProductCategory getProductCategory(int choice) {
        switch (choice) {
            case 1:
                return ProductCategory.PHONE;
            case 2:
                return ProductCategory.LAPTOP;
            case 3:
                return ProductCategory.FURNITURE;
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }
}
