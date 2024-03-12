import java.util.HashMap;

public class ProductFactory {
    private static final HashMap<String, Product> ProductMap = new HashMap<>();

    public static Product getLaptop(String color) {
        Laptop laptop = (Laptop) ProductMap.get(color);

        if (laptop == null) {
            laptop = new Laptop(color);
            ProductMap.put(color, laptop);
            System.out.println("Creating a " + color + " laptop");
        }
        return laptop;
    }

    public static Product getSmartphone(String color) {
        SmartPhone smartphone = (SmartPhone) ProductMap.get(color);

        if (smartphone == null) {
            smartphone = new SmartPhone(color);
            ProductMap.put(color, smartphone);
            System.out.println("Creating a " + color + " iPhone");
        }
        return smartphone;
    }
}
