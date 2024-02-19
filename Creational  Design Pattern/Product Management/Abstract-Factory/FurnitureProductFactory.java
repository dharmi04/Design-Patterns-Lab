class FurnitureProductFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new FurnitureProduct();
    }
}
