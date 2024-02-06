class LaptopFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new GamingLaptop(); // You can modify this to create different types of laptops
    }
}