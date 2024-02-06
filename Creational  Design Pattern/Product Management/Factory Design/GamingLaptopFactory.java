class GamingLaptopFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new GamingLaptop();
    }
}