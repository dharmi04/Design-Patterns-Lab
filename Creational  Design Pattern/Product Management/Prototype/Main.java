import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a product category:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Furniture");

        // Get user input for product category
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        Product product = null;

        switch (choice) {
            case 1:
                System.out.println("Choose a Smartphone type:");
                System.out.println("1. Apple");
                System.out.println("2. Samsung");

                // Get user input for smartphone type
                int smartphoneChoice = scanner.nextInt();

                switch (smartphoneChoice) {
                    case 1:
                        product = new ApplePhone();
                        break;
                    case 2:
                        product = new SamsungPhone();
                        break;
                    default:
                        System.out.println("Invalid choice for smartphone type.");
                       
                }
                break;

            case 2:
                System.out.println("Choose a Laptop type:");
                System.out.println("1. Daily-Use");
                System.out.println("2. Gaming");

                // Get user input for laptop type
                int laptopChoice = scanner.nextInt();

                switch (laptopChoice) {
                    case 1:
                        product = new DailyUseLaptop();
                        break;
                    case 2:
                        product = new GamingLaptop();
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
                        product = new Chair();
                        break;
                    case 2:
                        product = new Table();
                        break;
                    default:
                        System.out.println("Invalid choice for furniture type.");
                        
                }
                break;

            default:
                System.out.println("Invalid choice for product category.");
                
        }

        // Clone the selected product and display information
        Product clonedProduct = product.cloneProduct();
        clonedProduct.displayInfo();

        // If the selected product is furniture, perform additional actions
        if (clonedProduct instanceof Furniture) {
            Furniture furniture = (Furniture) clonedProduct;
            furniture.assemble();
        }

        scanner.close();
    }
}
