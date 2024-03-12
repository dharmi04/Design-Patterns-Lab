// Client class
public class Client {
    public static void main(String[] args) {
        // Creating laptop using adapter
        LaptopFactory laptopFactory = new LaptopFactory();
        Product laptopAdapter = (Product) new LaptopAdapter(laptopFactory);
        laptopAdapter.createProduct();

        // Creating smartphone using adapter
        SmartphoneFactory smartphoneFactory = new SmartphoneFactory();
        Product smartphoneAdapter = (Product) new SmartphoneAdapter(smartphoneFactory);
        smartphoneAdapter.createProduct();

        // Creating furniture using adapter
        FurnitureFactory furnitureFactory = new FurnitureFactory();
        Product furnitureAdapter = (Product) new FurnitureAdapter(furnitureFactory);
        furnitureAdapter.createProduct();
    }
}