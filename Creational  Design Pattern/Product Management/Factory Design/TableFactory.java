class TableFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Table();
    }
}