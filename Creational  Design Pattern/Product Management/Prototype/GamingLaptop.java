class GamingLaptop implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Gaming Laptop: High-performance laptop for gaming.");
    }

    @Override
    public Product cloneProduct() {
        return new GamingLaptop();
    }
}