class TableBuilder implements ProductBuilder {
    private final Table product = new Table();

    @Override
    public void buildBase() {
        // Build base features for table
        product.setBase("Table Base");
    }

    @Override
    public void buildAdditionalFeatures() {
        // Build additional features for table
        product.setAdditionalFeatures("Table Additional Features");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}