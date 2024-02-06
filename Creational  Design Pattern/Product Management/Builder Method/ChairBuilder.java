class ChairBuilder implements ProductBuilder {
    private final Chair product = new Chair();

    @Override
    public void buildBase() {
        // Build base features for chair
        product.setBase("Chair Base");
    }

    @Override
    public void buildAdditionalFeatures() {
        // Build additional features for chair
        product.setAdditionalFeatures("Chair Additional Features");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}