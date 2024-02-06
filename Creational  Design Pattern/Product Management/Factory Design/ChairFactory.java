class ChairFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Chair();
    }
}