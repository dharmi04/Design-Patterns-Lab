import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a product category:");
        System.out.println("1. Phone");
        System.out.println("2. Laptop");
        System.out.println("3. Furniture");

        // Get user input for product category
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        ProductFactory productFactory = null;

        switch (choice) {
            case 1:
                System.out.println("Choose a Phone type:");
                System.out.println("1. Apple Phone");
                System.out.println("2. Samsung Phone");

                // Get user input for phone type
                int phoneChoice = scanner.nextInt();

                switch (phoneChoice) {
                    case 1:
                        productFactory = new ApplePhoneFactory();
                        break;
                    case 2:
                        productFactory = new SamsungPhoneFactory();
                        break;
                    default:
                        System.out.println("Invalid choice for phone type.");
                       
                }
                break;

            case 2:
                System.out.println("Choose a Laptop type:");
                System.out.println("1. Daily-Use Laptop");
                System.out.println("2. Gaming Laptop");

                // Get user input for laptop type
                int laptopChoice = scanner.nextInt();

                switch (laptopChoice) {
                    case 1:
                        productFactory = new DailyUseLaptopFactory();
                        break;
                    case 2:
                        productFactory = new GamingLaptopFactory();
                        break;
                    default:
                        System.out.println("Invalid choice for laptop type.");
                      
                }
                break;

            case 3:
                System.out.println("Choose a furniture type:");
                System.out.println("1. Chair");
                System.out.println("2. Table");

                // Get user input for furniture type
                int furnitureChoice = scanner.nextInt();

                switch (furnitureChoice) {
                    case 1:
                        productFactory = new ChairFactory();
                        break;
                    case 2:
                        productFactory = new TableFactory();
                        break;
                    default:
                        System.out.println("Invalid choice for furniture type.");
                       
                }
                break;

            default:
                System.out.println("Invalid choice for product category.");
             
        }

        // Create the selected product and display information
        Product product = productFactory.createProduct();
        product.displayInfo();

        // If the selected product is furniture, perform additional actions
        if (product instanceof Furniture) {
            Furniture furniture = (Furniture) product;
            furniture.assemble();
        }

        scanner.close();
    }
}