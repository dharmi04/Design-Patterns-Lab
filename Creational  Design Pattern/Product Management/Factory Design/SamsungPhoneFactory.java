class SamsungPhoneFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new SamsungPhone();
    }
}