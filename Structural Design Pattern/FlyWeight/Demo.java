import java.util.Scanner;

public class Demo {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product type (Laptop/Smartphone): ");
        String productType = scanner.nextLine();

        if (productType.equalsIgnoreCase("Laptop")) {
            for (int i = 0; i < 10; ++i) {
                Laptop laptop = (Laptop) ProductFactory.getLaptop(getRandomColor());
                laptop.create();
            }
        } else if (productType.equalsIgnoreCase("Smartphone")) {
            for (int i = 0; i < 10; ++i) {
                SmartPhone smartphone = (SmartPhone) ProductFactory.getSmartphone(getRandomColor());
                smartphone.create();
            }
        } else {
            System.out.println("Invalid product type entered.");
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }
}
