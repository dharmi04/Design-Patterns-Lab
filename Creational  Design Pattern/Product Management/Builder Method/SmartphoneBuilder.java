class SmartphoneBuilder implements ProductBuilder {
    private final Smartphone product = new Smartphone();

    @Override
    public void buildBase() {
        // Build base features for smartphone
        product.setBase("Smartphone Base");
    }

    @Override
    public void buildAdditionalFeatures() {
        // Build additional features for smartphone
        product.setAdditionalFeatures("Smartphone Additional Features");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}