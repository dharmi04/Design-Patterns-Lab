class DailyUseLaptopFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new DailyUseLaptop();
    }
}