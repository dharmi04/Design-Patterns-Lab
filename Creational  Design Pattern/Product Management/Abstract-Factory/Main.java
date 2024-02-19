import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select the product to display:");
            System.out.println("1. Electronic Product");
            System.out.println("2. Furniture Product");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create electronic product
                    ProductFactory electronicFactory = new ElectronicProductFactory();
                    Product electronicProduct = electronicFactory.createProduct();
                    electronicProduct.display();
                    break;
                case 2:
                    // Create furniture product
                    ProductFactory furnitureFactory = new FurnitureProductFactory();
                    Product furnitureProduct = furnitureFactory.createProduct();
                    furnitureProduct.display();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
