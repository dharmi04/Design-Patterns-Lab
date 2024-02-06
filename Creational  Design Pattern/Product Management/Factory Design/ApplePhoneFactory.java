class ApplePhoneFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ApplePhone();
    }
}