import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductDirector director = new ProductDirector();

        System.out.println("Choose a product category:");
        System.out.println("1. Phone");
        System.out.println("2. Laptop");
        System.out.println("3. Furniture");

        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        ProductBuilder productBuilder = null;

        switch (choice) {
            case 1:
                productBuilder = new SmartphoneBuilder();
                break;
            case 2:
                productBuilder = new LaptopBuilder();
                break;
            case 3:
                System.out.println("Choose a furniture type:");
                System.out.println("1. Chair");
                System.out.println("2. Table");

                // Get user input for furniture type
                System.out.println("Enter your choice: ");
                int furnitureChoice = scanner.nextInt();

                switch (furnitureChoice) {
                    case 1:
                        productBuilder = new ChairBuilder();
                        break;
                    case 2:
                        productBuilder = new TableBuilder();
                        break;
                    default:
                        System.out.println("Invalid choice for furniture type.");
                        
                }
                break;
            default:
                System.out.println("Invalid choice for product category.");
               
        }

        // Construct and display the product
        Product product = director.construct(productBuilder);
        product.displayInfo();

        scanner.close();
    }
}
