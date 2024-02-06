// Director class
class ProductDirector {
    public Product construct(ProductBuilder builder) {
        builder.buildBase();
        builder.buildAdditionalFeatures();
        return builder.getProduct();
    }
}
