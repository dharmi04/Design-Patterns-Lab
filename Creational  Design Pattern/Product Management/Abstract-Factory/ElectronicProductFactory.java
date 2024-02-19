class ElectronicProductFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ElectronicProduct();
    }
}