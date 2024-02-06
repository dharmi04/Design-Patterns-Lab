class Laptop implements Product {
    @Override
    public void displayInfo() {
        System.out.println("Laptop: High-performance computing device.");
    }

    @Override
    public Product cloneProduct() {
        return new Laptop();
    }
}