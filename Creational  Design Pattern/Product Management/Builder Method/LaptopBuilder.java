class LaptopBuilder implements ProductBuilder {
    private final Laptop product = new Laptop();

    @Override
    public void buildBase() {
        // Build base features for laptop
        product.setBase("Laptop Base");
    }

    @Override
    public void buildAdditionalFeatures() {
        // Build additional features for laptop
        product.setAdditionalFeatures("Laptop Additional Features");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}