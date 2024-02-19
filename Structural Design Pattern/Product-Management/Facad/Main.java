import java.util.ArrayList;
import java.util.List;

// Product interface representing a generic product
interface Product {
    String getName();
    double getPrice();
}

// Concrete product: Laptop
class Laptop implements Product {
    private String name;
    private double price;

    public Laptop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Concrete product: Mobile
class Mobile implements Product {
    private String name;
    private double price;

    public Mobile(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Concrete product: Furniture
class Furniture implements Product {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Facade class providing a simplified interface to access product management functionalities
class ProductFacade {
    private List<Product> products;

    public ProductFacade() {
        products = new ArrayList<>();
    }

    // Add a product to the list
    public void addProduct(Product product) {
        products.add(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }
}

// Main class to demonstrate the Facade pattern
public class Main {
    public static void main(String[] args) {
        ProductFacade productFacade = new ProductFacade();

        // Adding some products
        productFacade.addProduct(new Laptop("Dell XPS 13", 1299.99));
        productFacade.addProduct(new Mobile("IPhone 15", 999.99));
        productFacade.addProduct(new Furniture("Sofa Set", 599.99));

        // Displaying all products
        List<Product> products = productFacade.getAllProducts();
        System.out.println("All Products:");
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }
}
